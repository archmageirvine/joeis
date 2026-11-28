package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Exact dimensions and quadratic fields of rational matrix-group commutants.
 * @author Gregory Morse
 */
final class RationalGroupCommutant {

  private final int mDimension;
  private final Q mQuadraticSquare;
  private final Q[][] mQuadraticGenerator;

  private RationalGroupCommutant(final int dimension, final Q[][] quadraticGenerator) {
    mDimension = dimension;
    mQuadraticGenerator = quadraticGenerator;
    mQuadraticSquare = quadraticGenerator == null ? null : squareEntry(quadraticGenerator);
  }

  private static Q squareEntry(final Q[][] x) {
    Q value = Q.ZERO;
    for (int j = 0; j < x.length; ++j) {
      value = value.add(x[0][j].multiply(x[j][0]));
    }
    return value;
  }

  Q[][] quadraticGenerator(final int square) {
    if (mQuadraticSquare == null || square == 0) {
      return null;
    }
    final Q ratio = new Q(square).divide(mQuadraticSquare);
    if (ratio.signum() <= 0 || !square(ratio.num()) || !square(ratio.den())) {
      return null;
    }
    final Q scaling = new Q(ratio.num().sqrt(), ratio.den().sqrt());
    return Arrays.stream(mQuadraticGenerator)
      .map(row -> Arrays.stream(row).map(q -> q.multiply(scaling)).toArray(Q[]::new)).toArray(Q[][]::new);
  }

  boolean excludes(final RationalGroupCommutant source) {
    // For irreducible rational modules these algebras are division
    // rings. A containment requires an injection in the other direction.
    if (source.mDimension % mDimension != 0) {
      return true;
    }
    if (mQuadraticSquare == null || source.mQuadraticSquare == null) {
      return false;
    }
    final Q quotient = mQuadraticSquare.divide(source.mQuadraticSquare);
    return quotient.signum() <= 0 || !square(quotient.num()) || !square(quotient.den());
  }

  private static boolean square(final Z n) {
    return n.sqrt().square().equals(n);
  }

  private static Q[][] identity(final int n) {
    final Q[][] matrix = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(matrix[i], Q.ZERO);
      matrix[i][i] = Q.ONE;
    }
    return matrix;
  }

  private static Q[][] fieldGenerator(final Q[][] inverse, final List<Q[][]> words, final Q[][] equations) {
    final int n = inverse.length;
    for (int free = 1; free < n; ++free) {
      if (equations[free] != null) {
        continue;
      }
      final Q[] u = new Q[n];
      Arrays.fill(u, Q.ZERO);
      u[free] = Q.ONE;
      for (int i = n - 1; i >= 0; --i) {
        if (equations[i] != null) {
          for (int j = i + 1; j < n; ++j) {
            u[i] = u[i].subtract(equations[i][j].multiply(u[j]));
          }
        }
      }
      final Q[][] values = new Q[n][];
      for (int i = 0; i < n; ++i) {
        values[i] = RationalBlockModels.action(u, words.get(i));
      }
      final Q[][] x = RationalGroupContainment.product(inverse, values);
      Q trace = Q.ZERO;
      for (int i = 0; i < n; ++i) {
        trace = trace.add(x[i][i]);
      }
      final Q mean = trace.divide(new Q(n));
      for (int i = 0; i < n; ++i) {
        x[i][i] = x[i][i].subtract(mean);
      }
      final Q[][] square = RationalGroupContainment.product(x, x);
      final Q d = square[0][0];
      if (d.signum() != 0) {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            if (!square[i][j].equals(i == j ? d : Q.ZERO)) {
              return null;
            }
          }
        }
        return x;
      }
    }
    return null;
  }

  static RationalGroupCommutant of(final Q[][][] generators) {
    final int n = generators[0].length;
    final Q[][] identity = identity(n);
    final Q[][] span = new Q[n][];
    final List<Q[]> orbit = new ArrayList<>();
    final List<Q[][]> words = new ArrayList<>();
    orbit.add(identity[0]);
    words.add(identity);
    RationalBlockModels.insert(span, identity[0]);
    for (int i = 0; i < orbit.size() && orbit.size() < n; ++i) {
      for (final Q[][] g : generators) {
        final Q[] v = RationalBlockModels.action(orbit.get(i), g);
        if (RationalBlockModels.insert(span, v)) {
          orbit.add(v);
          words.add(RationalGroupContainment.product(words.get(i), g));
          if (orbit.size() == n) {
            break;
          }
        }
      }
    }
    if (orbit.size() != n) {
      throw new IllegalArgumentException("The source is not rationally irreducible");
    }
    final Q[][] basis = orbit.toArray(Q[][]::new);
    final Q[][] inverse = RationalBlockModels.inverse(basis);
    final Q[][] equations = new Q[n][];
    int rank = 0;
    for (final Q[][] g : generators) {
      final Q[][] coordinates = RationalGroupContainment.product(RationalGroupContainment.product(basis, g), inverse);
      for (int i = 0; i < n; ++i) {
        final Q[][] right = RationalGroupContainment.product(words.get(i), g);
        // A commuting X is determined by u=e_0 X: the i-th row of
        // B X is u W_i. Comparing B X g and B g X supplies n-variable
        // linear constraints, without forming an n^2 by n^2 system.
        for (int j = 0; j < n; ++j) {
          final Q[] equation = new Q[n];
          for (int k = 0; k < n; ++k) {
            Q entry = right[k][j];
            for (int a = 0; a < n; ++a) {
              if (coordinates[i][a].signum() != 0 && words.get(a)[k][j].signum() != 0) {
                entry = entry.subtract(coordinates[i][a].multiply(words.get(a)[k][j]));
              }
            }
            equation[k] = entry;
          }
          if (RationalBlockModels.insert(equations, equation) && ++rank == n - 1) {
            return new RationalGroupCommutant(1, null);
          }
        }
      }
    }
    final int dimension = n - rank;
    return new RationalGroupCommutant(dimension, dimension == 2 ? fieldGenerator(inverse, words, equations) : null);
  }
}

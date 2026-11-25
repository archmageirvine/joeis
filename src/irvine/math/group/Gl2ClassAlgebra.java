package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Character table statistics from the integral class algebra of GL(2,Z_n).
 * @author Gregory Morse
 */
public final class Gl2ClassAlgebra {

  private final int mOrder;
  private final int[] mClassSizes;
  private final int[] mInverseClass;
  // For each class sum, its multiplication matrix in the class-sum basis.
  private final int[][][] mProducts;

  private Gl2ClassAlgebra(final int modulus) {
    final Gl2ResidueGroup group = new Gl2ResidueGroup(modulus);
    final List<Integer> elements = group.elements();
    mOrder = elements.size();
    final int[] classes = new int[group.bound()];
    Arrays.fill(classes, -1);
    final List<Integer> reps = new ArrayList<>();
    for (final int x : elements) {
      if (classes[x] < 0) {
        final int index = reps.size();
        reps.add(x);
        for (final int y : elements) {
          classes[group.multiply(group.multiply(y, x), group.inverse(y))] = index;
        }
      }
    }
    final int k = reps.size();
    mClassSizes = new int[k];
    mInverseClass = new int[k];
    mProducts = new int[k][k][k];
    for (final int x : elements) {
      ++mClassSizes[classes[x]];
    }
    for (int i = 0; i < k; ++i) {
      final int representative = reps.get(i);
      mInverseClass[i] = classes[group.inverse(representative)];
      for (final int x : elements) {
        // The other factor is forced by xy = representative.
        ++mProducts[classes[x]][i][classes[group.multiply(group.inverse(x), representative)]];
      }
    }
  }

  private static int rank(final int[][] matrix) {
    final int n = matrix.length;
    final Z[][] a = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        a[i][j] = Z.valueOf(matrix[i][j]);
      }
    }
    // Fraction-free elimination computes rank over characteristic zero.
    int r = 0;
    Z last = Z.ONE;
    for (int j = 0; j < n && r < n; ++j) {
      int pivot = r;
      while (pivot < n && a[pivot][j].isZero()) {
        ++pivot;
      }
      if (pivot < n) {
        final Z[] row = a[pivot];
        a[pivot] = a[r];
        a[r] = row;
        final Z value = row[j];
        for (int i = r + 1; i < n; ++i) {
          for (int k = j + 1; k < n; ++k) {
            a[i][k] = a[i][k].multiply(value).subtract(a[i][j].multiply(row[k])).divide(last);
          }
          a[i][j] = Z.ZERO;
        }
        last = value;
        ++r;
      }
    }
    return r;
  }

  /**
   * Count zero entries in the character table.
   * @param modulus positive modulus
   * @return number of zeros
   */
  public static Z zeros(final long modulus) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z entries = Z.ONE;
    Z nonzero = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final Gl2ClassAlgebra algebra = new Gl2ClassAlgebra(p.pow(fs.getExponent(p)).intValueExact());
      long sum = 0;
      // Class-sum eigenvalues are nonzero multiples of the character
      // values in that column. Hence rank counts its nonzero entries.
      for (final int[][] column : algebra.mProducts) {
        sum += rank(column);
      }
      entries = entries.multiply((long) algebra.mClassSizes.length * algebra.mClassSizes.length);
      nonzero = nonzero.multiply(sum);
    }
    return entries.subtract(nonzero);
  }

  private Z[][] operator(final Z[] element) {
    final int n = mClassSizes.length;
    final Z[][] matrix = new Z[n][n];
    for (final Z[] row : matrix) {
      Arrays.fill(row, Z.ZERO);
    }
    for (int i = 0; i < n; ++i) {
      if (!element[i].isZero()) {
        for (int r = 0; r < n; ++r) {
          for (int c = 0; c < n; ++c) {
            final int coefficient = mProducts[i][r][c];
            if (coefficient != 0) {
              matrix[r][c] = matrix[r][c].add(element[i].multiply(coefficient));
            }
          }
        }
      }
    }
    return matrix;
  }

  private static Z[][] multiply(final Z[][] a, final Z[][] b) {
    final int n = a.length;
    final Z[][] product = new Z[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(product[i], Z.ZERO);
      for (int j = 0; j < n; ++j) {
        if (!a[i][j].isZero()) {
          for (int k = 0; k < n; ++k) {
            if (!b[j][k].isZero()) {
              product[i][k] = product[i][k].add(a[i][j].multiply(b[j][k]));
            }
          }
        }
      }
    }
    return product;
  }

  private Set<Z> degrees(final Z p, final int e) {
    final Set<Z> degrees = new TreeSet<>(List.of(Z.ONE, p.subtract(1), p, p.add(1)));
    // Onn, Representations of automorphism groups of finite O-modules
    // of rank two, Theorem 1.4. Include all possible degrees, including
    // any whose coefficient vanishes at p=2.
    for (int j = 2; j <= e; ++j) {
      degrees.add(p.pow(j - 1).multiply(p.subtract(1)));
      degrees.add(p.pow(j - 2).multiply(p.square().subtract(1)));
      degrees.add(p.pow(j - 1).multiply(p.add(1)));
    }
    return degrees;
  }

  private Q[] degreePolynomial(final Z p, final int e) {
    final Z[] degrees = degrees(p, e).toArray(new Z[0]);
    final Z[] points = new Z[degrees.length];
    for (int j = 0; j < points.length; ++j) {
      points[j] = Z.valueOf(mOrder).divide(degrees[j]).square();
    }
    final Q[] polynomial = new Q[degrees.length];
    Arrays.fill(polynomial, Q.ZERO);
    for (int i = 0; i < points.length; ++i) {
      final Z[] term = new Z[degrees.length];
      Arrays.fill(term, Z.ZERO);
      term[0] = degrees[i];
      Z denominator = Z.ONE;
      int degree = 0;
      for (int j = 0; j < points.length; ++j) {
        if (j != i) {
          for (int k = ++degree; k >= 1; --k) {
            term[k] = term[k - 1].subtract(points[j].multiply(term[k]));
          }
          term[0] = points[j].negate().multiply(term[0]);
          denominator = denominator.multiply(points[i].subtract(points[j]));
        }
      }
      for (int j = 0; j < polynomial.length; ++j) {
        polynomial[j] = polynomial[j].add(new Q(term[j], denominator));
      }
    }
    return polynomial;
  }

  private Z sum(final Z p, final int e) {
    final int n = mClassSizes.length;
    final Z[] average = new Z[n];
    final Z[] commutators = new Z[n];
    Arrays.fill(commutators, Z.ZERO);
    for (int i = 0; i < n; ++i) {
      final int weight = mOrder / mClassSizes[i];
      average[i] = Z.valueOf(weight);
      for (int j = 0; j < n; ++j) {
        commutators[j] = commutators[j].add((long) weight * mProducts[i][j][mInverseClass[i]]);
      }
    }
    // On a character of degree d, these two central elements have
    // eigenvalues |G|*sum_C chi(C)/d and (|G|/d)^2, respectively.
    // Interpolate D((|G|/d)^2)=d, then take the trace on the center.
    Z[][] matrix = operator(average);
    final Z[][] comm = operator(commutators);
    final Q[] polynomial = degreePolynomial(p, e);
    Q total = Q.ZERO;
    for (int k = 0; k < polynomial.length; ++k) {
      Z trace = Z.ZERO;
      for (int i = 0; i < n; ++i) {
        trace = trace.add(matrix[i][i]);
      }
      total = total.add(polynomial[k].multiply(trace));
      if (k + 1 < polynomial.length) {
        matrix = multiply(matrix, comm);
      }
    }
    return total.divide(mOrder).toZ();
  }

  /**
   * Sum the entries in the character table.
   * @param modulus positive modulus
   * @return sum of character values
   */
  public static Z characterSum(final long modulus) {
    final FactorSequence fs = Jaguar.factor(modulus);
    Z total = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      total = total.multiply(new Gl2ClassAlgebra(p.pow(e).intValueExact()).sum(p, e));
    }
    return total;
  }
}

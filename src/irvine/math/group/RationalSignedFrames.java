package irvine.math.group;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Search for a certified rational signed permutation basis using commuting involutions.
 * @author Gregory Morse
 */
final class RationalSignedFrames {

  private RationalSignedFrames() { }

  private static Q[][] identity(final int n) {
    final Q[][] result = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(result[i], Q.ZERO);
      result[i][i] = Q.ONE;
    }
    return result;
  }

  private static Q[][] power(Q[][] a, Z exponent) {
    Q[][] value = identity(a.length);
    while (!exponent.isZero()) {
      if (!exponent.isEven()) {
        value = RationalGroupContainment.product(value, a);
      }
      exponent = exponent.divide2();
      if (!exponent.isZero()) {
        a = RationalGroupContainment.product(a, a);
      }
    }
    return value;
  }

  private static Q[] action(final Q[] v, final Q[][] g) {
    final Q[] result = new Q[v.length];
    Arrays.fill(result, Q.ZERO);
    for (int i = 0; i < v.length; ++i) {
      if (v[i].signum() != 0) {
        for (int j = 0; j < v.length; ++j) {
          if (g[i][j].signum() != 0) {
            result[j] = result[j].add(v[i].multiply(g[i][j]));
          }
        }
      }
    }
    return result;
  }

  private static void add(final Q[][] basis, final Q[] row) {
    for (int i = 0; i < row.length; ++i) {
      final Q scale = row[i];
      if (scale.signum() != 0) {
        if (basis[i] == null) {
          for (int j = i; j < row.length; ++j) {
            row[j] = row[j].divide(scale);
          }
          basis[i] = row;
          return;
        }
        for (int j = i; j < row.length; ++j) {
          if (basis[i][j].signum() != 0) {
            row[j] = row[j].subtract(scale.multiply(basis[i][j]));
          }
        }
      }
    }
  }

  private static List<Q[][]> split(final List<Q[][]> spaces, final Q[][] involution) {
    final int n = involution.length;
    final List<Q[][]> result = new ArrayList<>();
    for (final Q[][] subspace : spaces) {
      final Q[][] plus = new Q[n][];
      final Q[][] minus = new Q[n][];
      for (final Q[] v : subspace) {
        final Q[] image = action(v, involution);
        final Q[] a = new Q[n];
        final Q[] b = new Q[n];
        for (int j = 0; j < n; ++j) {
          a[j] = v[j].add(image[j]);
          b[j] = v[j].subtract(image[j]);
        }
        add(plus, a);
        add(minus, b);
      }
      final Q[][] p = Arrays.stream(plus).filter(v -> v != null).toArray(Q[][]::new);
      final Q[][] m = Arrays.stream(minus).filter(v -> v != null).toArray(Q[][]::new);
      if (p.length + m.length != subspace.length) {
        return List.of();
      }
      if (p.length != 0) {
        result.add(p);
      }
      if (m.length != 0) {
        result.add(m);
      }
    }
    return result;
  }

  private static boolean sameLine(final Q[] u, final Q[] v) {
    int pivot = 0;
    while (v[pivot].signum() == 0) {
      ++pivot;
    }
    if (u[pivot].signum() == 0) {
      return false;
    }
    final Q ratio = u[pivot].divide(v[pivot]);
    for (int i = 0; i < v.length; ++i) {
      if (!u[i].equals(v[i].multiply(ratio))) {
        return false;
      }
    }
    return true;
  }

  private static boolean tryInvolution(final Q[][][] generators, final Q[][][] inverses, final Q[][] involution) {
    final int n = involution.length;
    final List<Q[][]> queue = new ArrayList<>();
    final Set<String> seen = new HashSet<>();
    queue.add(involution);
    seen.add(Arrays.deepToString(involution));
    List<Q[][]> spaces = java.util.Collections.singletonList(identity(n));
    for (int k = 0; k < queue.size() && k < 64; ++k) {
      final Q[][] x = queue.get(k);
      spaces = split(spaces, x);
      if (spaces.isEmpty()) {
        return false;
      }
      if (spaces.size() == n) {
        for (final Q[][] g : generators) {
          for (final Q[][] space : spaces) {
            final Q[] image = action(space[0], g);
            if (spaces.stream().noneMatch(line -> sameLine(image, line[0]))) {
              return false;
            }
          }
        }
        // A finite rational line stabilizer acts by +/-1. Choose a
        // transported vector on each line orbit to get signed matrices.
        return true;
      }
      for (int j = 0; j < generators.length; ++j) {
        final Q[][] child = RationalGroupContainment.product(RationalGroupContainment.product(inverses[j], x), generators[j]);
        if (seen.add(Arrays.deepToString(child))) {
          queue.add(child);
        }
      }
    }
    return false;
  }

  static boolean find(final Q[][][] generators, final Z order) {
    if (!order.isEven()) {
      return false;
    }
    final Q[][] id = identity(generators[0].length);
    final Q[][] neg = Arrays.stream(id).map(row -> Arrays.stream(row).map(Q::negate).toArray(Q[]::new)).toArray(Q[][]::new);
    Z odd = order;
    while (odd.isEven()) {
      odd = odd.divide2();
    }
    final Q[][][] inverses = Arrays.stream(generators).map(g -> power(g, order.subtract(Z.ONE))).toArray(Q[][][]::new);
    final List<Q[][]> words = new ArrayList<>(Arrays.asList(generators));
    for (final Q[][] a : generators) {
      for (final Q[][] b : generators) {
        words.add(RationalGroupContainment.product(a, b));
      }
    }
    final Set<String> tested = new HashSet<>();
    for (final Q[][] w : words) {
      Q[][] a = power(w, odd);
      if (!Arrays.deepEquals(a, id)) {
        Q[][] b = RationalGroupContainment.product(a, a);
        for (int k = 0; k < order.bitLength() && !Arrays.deepEquals(b, id); ++k) {
          a = b;
          b = RationalGroupContainment.product(a, a);
        }
        if (Arrays.deepEquals(b, id) && !Arrays.deepEquals(a, neg) && tested.add(Arrays.deepToString(a)) && tryInvolution(generators, inverses, a)) {
          return true;
        }
      }
    }
    return false;
  }
}

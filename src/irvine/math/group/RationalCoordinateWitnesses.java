package irvine.math.group;

import java.util.Arrays;

import irvine.math.q.Q;

/**
 * Small changes of coordinates yielding exact rational containment witnesses.
 * @author Gregory Morse
 */
final class RationalCoordinateWitnesses {

  private RationalCoordinateWitnesses() { }

  private static Q[][] identity(final int n) {
    final Q[][] identity = new Q[n][n];
    for (int i = 0; i < n; ++i) {
      Arrays.fill(identity[i], Q.ZERO);
      identity[i][i] = Q.ONE;
    }
    return identity;
  }

  private static boolean permute(final Q[][][] generators, final Q[][][] negatives, final RationalGroupContainment.Target target,
                                 final int[] permutation, final int depth, final int used, final Q[][] matrix) {
    final int n = permutation.length;
    if (depth != n) {
      for (int j = 0; j < n; ++j) {
        if ((used & (1 << j)) == 0) {
          permutation[depth] = j;
          if (permute(generators, negatives, target, permutation, depth + 1, used | (1 << j), matrix)) {
            return true;
          }
        }
      }
      return false;
    }
    for (int bits = 0; bits < (1 << (n - 1)); ++bits) {
      boolean contained = true;
      for (int g = 0; contained && g < generators.length; ++g) {
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            final Q[][] source = (((bits >>> i) ^ (bits >>> j)) & 1) == 0 ? generators[g] : negatives[g];
            matrix[i][j] = source[permutation[i]][permutation[j]];
          }
        }
        contained = target.contains(matrix);
      }
      if (contained) {
        return true;
      }
    }
    return false;
  }

  private static boolean test(final Q[][][] a, final RationalGroupContainment.Target target, final int n) {
    final Q[][][] negatives = new Q[a.length][n][n];
    for (int k = 0; k < a.length; ++k) {
      for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) {
          negatives[k][i][j] = a[k][i][j].negate();
        }
      }
    }
    return permute(a, negatives, target, new int[n], 0, 0, new Q[n][n]);
  }

  private static Q[][][] conjugate(final Q[][][] a, final Q[][] change, final Q[][] inverse) {
    return Arrays.stream(a).map(g -> RationalGroupContainment.product(RationalGroupContainment.product(inverse, g), change)).toArray(Q[][][]::new);
  }

  static boolean find(final Q[][][] generators, final RationalGroupContainment.Target target) {
    final int n = generators[0].length;
    if (n > 6) {
      throw new UnsupportedOperationException("Exhaustive signed coordinate changes are limited to dimension six");
    }
    if (test(generators, target, n)) {
      return true;
    }
    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        if (i != j) {
          for (final Q sign : new Q[] {Q.ONE, Q.NEG_ONE}) {
            final Q[][] change = identity(n);
            final Q[][] inverse = identity(n);
            change[i][j] = sign;
            inverse[i][j] = sign.negate();
            if (test(conjugate(generators, change, inverse), target, n)) {
              return true;
            }
          }
        } else {
          for (int scale = 2; scale <= 3; ++scale) {
            final Q[][] change = identity(n);
            final Q[][] inverse = identity(n);
            change[i][i] = new Q(scale);
            inverse[i][i] = new Q(1, scale);
            if (test(conjugate(generators, change, inverse), target, n)) {
              return true;
            }
          }
        }
      }
    }
    // Failure to find one of these transporters is not a noncontainment proof.
    return false;
  }
}

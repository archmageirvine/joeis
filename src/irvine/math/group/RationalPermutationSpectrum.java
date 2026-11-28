package irvine.math.group;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Trace-power tests for signed permutation and signed deleted permutation matrices.
 * @author Gregory Morse
 */
final class RationalPermutationSpectrum {

  private RationalPermutationSpectrum() { }

  private static boolean signed(final int n, final int k, final int used, final int[] t, final Set<String> failed) {
    if (used == n) {
      for (int i = k; i <= n; ++i) {
        if (t[i] != 0) {
          return false;
        }
      }
      return true;
    }
    if (k > n || t[k] % k != 0) {
      return false;
    }
    final int trace = t[k];
    final int difference = trace / k;
    final int low = Math.max(0, -difference);
    final int high = Math.floorDiv((n - used) / k - difference, 2);
    if (high < low) {
      return false;
    }
    final String state = k + ":" + used + ":" + Arrays.toString(Arrays.copyOfRange(t, k, t.length));
    if (!failed.add(state)) {
      return false;
    }
    for (int negative = low; negative <= high; ++negative) {
      final int mass = k * (difference + 2 * negative);
      for (int j = 2 * k; j <= n; j += k) {
        t[j] -= ((j / k) & 1) == 0 ? mass : trace;
      }
      final boolean possible = signed(n, k + 1, used + mass, t, failed);
      for (int j = 2 * k; j <= n; j += k) {
        t[j] += ((j / k) & 1) == 0 ? mass : trace;
      }
      if (possible) {
        return true;
      }
    }
    return false;
  }

  static boolean signedPermutation(final int dimension, final int[] powers) {
    if (powers.length < dimension) {
      throw new IllegalArgumentException("Missing signed permutation trace powers");
    }
    final int[] residual = new int[dimension + 1];
    System.arraycopy(powers, 0, residual, 1, dimension);
    return signed(dimension, 1, 0, residual, new HashSet<>());
  }

  private static boolean deleted(final int rank, final int[] powers, final int sign) {
    final int[] fixed = new int[rank + 1];
    for (int k = 1; k <= rank; ++k) {
      fixed[k] = 1 + ((k & 1) == 0 ? 1 : sign) * powers[k - 1];
    }
    int total = 0;
    for (int k = 1; k <= rank; ++k) {
      final int a = fixed[k];
      if (a < 0 || a % k != 0 || (total += a) > rank) {
        return false;
      }
      for (int j = 2 * k; j <= rank; j += k) {
        fixed[j] -= a;
      }
    }
    return total == rank;
  }

  static boolean signedDeletedPermutation(final int dimension, final int[] powers) {
    if (powers.length <= dimension) {
      throw new IllegalArgumentException("Missing signed deleted permutation trace powers");
    }
    return deleted(dimension + 1, powers, 1) || deleted(dimension + 1, powers, -1);
  }
}

package irvine.math.partition;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;

/**
 * Implementation of the Murnaghan-Nakayama rule.  This is useful for computing
 * character tables.
 * @author Sean A. Irvine
 */
public final class MurnaghanNakayama {

  private MurnaghanNakayama() { }

  static StringBuilder essentialPartitionSequence(final int[] partition) {
    final StringBuilder res = new StringBuilder();
    int prev = 0;
    for (int k = partition.length - 1; k >= 0; --k) {
      final int part = partition[k];
      final int ones = part - prev;
      for (int j = 0; j < ones; ++j) {
        res.append('1');
      }
      res.append('0');
      prev = part;
    }
    return res;
  }

  private static boolean isRimHook(final CharSequence r, final int a, final int b) {
    return r.charAt(a) == '1' && r.charAt(b) == '0';
  }

  private static Z inner(final Map<String, Z> cache, final StringBuilder r, final int t, final int[] mu) {
    if (t >= mu.length) {
      return Z.ONE;
    }
    final String key = r.toString();
    final Z chr = cache.get(key);
    if (chr != null) {
      return chr;
    }
    Z chi = Z.ZERO;
    boolean sigma = true;
    for (int j = 0; j < Math.min(mu[t] - 1, r.length()); ++j) {
      if (r.charAt(j) == '0') {
        sigma = !sigma;
      }
    }
    for (int i = 0; i < r.length() - mu[t]; ++i) {
      final int j = i + mu[t];
      if (r.charAt(i) != r.charAt(j - 1)) {
        sigma = !sigma;
      }
      if (isRimHook(r, i, j)) {
        r.setCharAt(i, r.charAt(j));
        r.setCharAt(j, '1');
        chi = chi.signedAdd(sigma, inner(cache, r, t + 1, mu));
        r.setCharAt(j, r.charAt(i));
        r.setCharAt(i, '1');
      }
    }
    cache.put(key, chi);
    return chi;
  }

  /**
   * Compute the character value of partitions.
   * @param lambda first partition
   * @param mu second partition
   * @return character
   */
  public static Z character(final int[] lambda, final int[] mu) {
    return inner(new HashMap<>(), essentialPartitionSequence(lambda), 0, mu);
  }
}


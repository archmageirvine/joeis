package irvine.oeis.a394;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A394228 The exponent j of the first pair of powers of 2 (2^j, 2^k), j &lt; k, where 2^k is the smallest power whose last n digits are a non-identical anagram (besides n=1), no leading zeros, of the last n digits of 2^j.
 * @author Sean A. Irvine
 */
public class A394228 extends Sequence1 {

  // After Michael Branicky

  private int mN = 0;

  private static String sortDigits(final String s) {
    final int[] cnt = new int[10];
    for (int k = 0; k < s.length(); ++k) {
      ++cnt[s.charAt(k) - '0'];
    }
    final StringBuilder sb = new StringBuilder(s.length());
    for (int d = 0; d < 10; ++d) {
      sb.append(String.valueOf((char) ('0' + d)).repeat(cnt[d]));
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z mod = Z.TEN.pow(mN);
    Z pow2mod = Z.TWO.modPow(Z.valueOf(3L * mN), mod);
    final HashMap<String, Pair<String, Z>> seen = new HashMap<>();
    for (Z k = Z.valueOf(3L * mN); k.compareTo(mod) <= 0; k = k.add(1)) {
      final String s = pow2mod.toString();
      if (s.length() == mN) {
        final String key = sortDigits(s);
        final Pair<String, Z> v = seen.get(key);
        if (v != null && !v.left().equals(s)) {
          return seen.get(key).right();
        } else {
          seen.put(key, new Pair<>(s, k));
        }
      }
      pow2mod = pow2mod.multiply2().mod(mod);
    }
    throw new RuntimeException();
  }
}

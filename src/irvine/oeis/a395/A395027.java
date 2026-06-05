package irvine.oeis.a395;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395027 allocated for Rhys Feltman.
 * @author Sean A. Irvine
 */
public class A395027 extends Sequence1 {

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
      return Z.FIVE;
    }
    final Z mod = Z.TEN.pow(mN);
    Z pow2mod = Z.TWO.modPow(Z.valueOf(3L * mN), mod);
    final HashMap<String, String> seen = new HashMap<>();
    for (Z k = Z.valueOf(3L * mN); k.compareTo(mod) <= 0; k = k.add(1)) {
      final String s = pow2mod.toString();
      if (s.length() == mN) {
        final String key = sortDigits(s);
        final String v = seen.get(key);
        if (v != null && !v.equals(s)) {
          return k;
        } else {
          seen.put(key, s);
        }
      }
      pow2mod = pow2mod.multiply2().mod(mod);
    }
    throw new RuntimeException();
  }
}

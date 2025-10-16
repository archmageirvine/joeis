package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389720 a(n) is the largest prime number obtainable by inserting a single digit anywhere in n (including at the beginning or end), or -1 if no such prime is obtainable.
 * @author Sean A. Irvine
 */
public class A389720 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    Z max = Z.NEG_ONE;
    for (int k = 0; k <= s.length(); ++k) {
      for (int d = 0; d < 10; ++d) {
        final Z t = new Z(s.substring(0, k) + d + s.substring(k));
        if (t.compareTo(max) > 0 && t.isProbablePrime()) {
          max = t;
        }
      }
    }
    return max;
  }
}

package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077739 Smallest multiple of n beginning and ending in n and having a digit sum of n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077739 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 11 || mN == 17 || mN == 19) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    long m = 0;
    while (true) {
      m += mN;
      if (Functions.DIGIT_SUM.l(m) == mN) {
        final String t = String.valueOf(m);
        if (t.startsWith(s) && t.endsWith(s)) {
          return Z.valueOf(m);
        }
      }
    }
  }
}

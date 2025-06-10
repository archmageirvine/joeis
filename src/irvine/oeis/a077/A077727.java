package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077727 Smallest multiple of n beginning with n and having a digit sum n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A077727 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 11) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    long m = 0;
    while (true) {
      m += mN;
      if (Functions.DIGIT_SUM.l(m) == mN && String.valueOf(m).startsWith(s)) {
        return Z.valueOf(m);
      }
    }
  }
}

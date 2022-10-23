package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;
import irvine.util.string.StringUtils;

/**
 * A052289 Numbers n such that n!*2^n + n + 1 = A000165(n) + n + 1 is prime.
 * @author Sean A. Irvine
 */
public class A052289 extends A000142 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().shiftLeft((int) mN).add(mN + 1);
      if (t.isProbablePrime()) {
        return Z.valueOf(mN);
      }
      if (mVerbose && mN % 100 == 0) {
        StringUtils.message("n=" + mN);
      }
    }
  }
}

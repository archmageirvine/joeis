package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A002589 Largest primitive factor of 2^(2n+1) + 1.
 *
 * @author Sean A. Irvine
 */
public class A002589 extends Sequence0 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = -1;

  private boolean isIntrinsic(final Z p, final int n) {
    if (Z.ONE.equals(p)) {
      return false;
    }
    Z b = Z.TWO;
    for (int k = 2; k < n; ++k, b = b.shiftLeft(1)) {
      if (b.subtract(1).mod(p).isZero()) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    mN += 2;
    Z n = Cyclotomic.cyclotomic(2 * mN, 2);
    if (mVerbose) {
      System.out.println("Doing: 2^" + mN + "+1 Phi(" + 2 * mN + ",2)=" + n);
    }
    while (true) {
      final Z lpf = Jaguar.factor(n).largestPrimeFactor();
      if (!isIntrinsic(lpf, 2 * mN)) {
        return lpf;
      }
      if (mVerbose) {
        System.out.println(lpf + " was intrinsic");
      }
      n = n.divide(lpf);
    }
  }
}

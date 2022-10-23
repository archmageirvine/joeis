package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000108 Catalan numbers: C(n) = binomial(2n,n)/(n+1) = (2n)!/(n!(n+1)!).
 * @author Sean A. Irvine
 */
public class A000108 extends Sequence0 {

  protected long mN = -1;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mC = mC.multiply2().multiply(2 * mN - 1).divide(mN);
    return mC.divide(mN + 1);
  }
}


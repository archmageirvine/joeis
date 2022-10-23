package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002057 Fourth convolution of Catalan numbers: 4*binomial(2n+3,n)/(n+4).
 * @author Sean A. Irvine
 */
public class A002057 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(Z.valueOf(mN).square().multiply2().add(5 * mN + 3).multiply2()).divide(mN).divide(mN + 4);
    }
    return mA;
  }
}

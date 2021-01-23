package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a045.A045757;

/**
 * A035308 Expansion of 1/(1-100*x)^(1/10), related to deca-factorial numbers A045757.
 * @author Sean A. Irvine
 */
public class A035308 extends A045757 {

  private long mN = -1;
  private Z mF = Z.ONE;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    mF = mF.multiply(mN);
    mT = mT.multiply(10);
    return mT.multiply(super.next()).divide(mF);
  }
}


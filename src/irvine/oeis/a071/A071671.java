package irvine.oeis.a071;

import irvine.math.z.Z;

/**
 * A071655.
 * @author Sean A. Irvine
 */
public class A071671 extends A071652 {

  private Z mN = Z.ZERO;
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(unrankBinTree(mN, mLambda1, mLambda2).toZ().toString(2));
  }
}

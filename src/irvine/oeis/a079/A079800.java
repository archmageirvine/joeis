package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079800 Initial term of n-th group in A079798.
 * @author Sean A. Irvine
 */
public class A079800 extends A079798 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ONE;
    }
    mA = mA.add(super.next());
    return mA.multiply(8).add(1).sqrt().add(1).divide(2);
  }
}


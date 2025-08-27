package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079801 Final term of n-th group in A079798.
 * @author Sean A. Irvine
 */
public class A079801 extends A079798 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(super.next());
    return mA.multiply(8).add(1).sqrt().subtract(1).divide(2);
  }
}


package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075099.
 * @author Sean A. Irvine
 */
public class A075100 extends A075099  {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(1L << ++mN).max(Z.ZERO);
  }
}

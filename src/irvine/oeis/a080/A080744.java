package irvine.oeis.a080;

import irvine.math.z.Z;

/**
 * A080744 Smallest element of n-th row of A080743.
 * @author Sean A. Irvine
 */
public class A080744 extends A080743 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN).get(0);
  }
}

package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048732 a(n) = Xpower(n,3);.
 * @author Sean A. Irvine
 */
public class A048732 extends A048723 {

  private long mN = -1;

  @Override
  public Z next() {
    return power(++mN, 3);
  }
}

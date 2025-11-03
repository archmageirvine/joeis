package irvine.oeis.a081;

import irvine.math.z.Z;

/**
 * A081524 a(n) = A081523(n)/n.
 * @author Sean A. Irvine
 */
public class A081524 extends A081523 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}

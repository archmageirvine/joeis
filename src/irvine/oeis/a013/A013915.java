package irvine.oeis.a013;

import irvine.math.z.Z;

/**
 * A013915 a(n) = F(n) + L(n) + n, where F(n) (A000045) and L(n) (A000204) are Fibonacci and Lucas numbers respectively.
 * @author Sean A. Irvine
 */
public class A013915 extends A013655 {

  private long mN = -1;

  @Override
  public Z next() {
    return super.next().add(++mN);
  }
}

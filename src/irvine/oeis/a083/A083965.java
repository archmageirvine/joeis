package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083965 a(n) = A083964(n)/(2n-1).
 * @author Sean A. Irvine
 */
public class A083965 extends A083964 {

  @Override
  public Z next() {
    return super.next().divide(mN);
  }
}

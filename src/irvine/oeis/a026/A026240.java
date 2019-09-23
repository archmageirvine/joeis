package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026240 <code>a(n) = |s(n) - n|</code>, where s <code>= A026239</code>.
 * @author Sean A. Irvine
 */
public class A026240 extends A026239 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN).abs();
  }
}

package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025257 <code>(1/3)*s(n+3)</code>, where s <code>= A025256</code>.
 * @author Sean A. Irvine
 */
public class A025257 extends A025256 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}

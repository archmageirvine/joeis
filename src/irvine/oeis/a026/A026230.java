package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026230 <code>a(n) = (1/3)*s(n+1)</code>, where s <code>= A026229</code>.
 * @author Sean A. Irvine
 */
public class A026230 extends A026229 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}

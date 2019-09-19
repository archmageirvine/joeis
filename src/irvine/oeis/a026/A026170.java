package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026170 <code>(1/2)*s(n+1)</code>, where s <code>= A026169</code>.
 * @author Sean A. Irvine
 */
public class A026170 extends A026169 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

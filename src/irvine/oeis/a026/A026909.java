package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026909 <code>(1/2)*T(2n,n)</code>, T given by <code>A026907</code>.
 * @author Sean A. Irvine
 */
public class A026909 extends A026908 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024740 <code>s(n+3)/4</code>, where s is <code>A024739</code>.
 * @author Sean A. Irvine
 */
public class A024740 extends A024739 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}

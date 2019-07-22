package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024742 <code>a(n) = s(n+3)/6</code>, where s is <code>A024741</code>.
 * @author Sean A. Irvine
 */
public class A024742 extends A024741 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(6);
  }
}

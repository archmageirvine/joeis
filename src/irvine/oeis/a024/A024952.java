package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024952 <code>a(n) = s(n+3)/5</code>, where s is <code>A024951</code>.
 * @author Sean A. Irvine
 */
public class A024952 extends A024951 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}

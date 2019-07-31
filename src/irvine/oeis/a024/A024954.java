package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024954 <code>a(n) = s(n+3)/6</code>, where s is <code>A024953</code>.
 * @author Sean A. Irvine
 */
public class A024954 extends A024953 {

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

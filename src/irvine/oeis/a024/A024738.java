package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024738 <code>a(n) = s(n+3)/3</code>, where s is <code>A024737</code>.
 * @author Sean A. Irvine
 */
public class A024738 extends A024737 {

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

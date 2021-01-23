package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024738 a(n) = s(n+3)/3, where s is A024737.
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

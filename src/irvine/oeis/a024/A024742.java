package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024742 <code>a(n) = A024741(n+3)/6</code>.
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

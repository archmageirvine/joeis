package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024726 a(n) = s(n+3)/3, where s(n) = A024725(n).
 * @author Sean A. Irvine
 */
public class A024726 extends A024725 {

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

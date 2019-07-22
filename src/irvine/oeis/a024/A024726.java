package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024726 <code>a(n) = s(n+3)/3</code>, where s is <code>A024725</code>.
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

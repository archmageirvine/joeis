package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025245 a(n) = (1/2)*s(n+3), where s = A025244.
 * @author Sean A. Irvine
 */
public class A025245 extends A025244 {

  {
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025252 (1/2)*s(n+3), where s = A025251.
 * @author Sean A. Irvine
 */
public class A025252 extends A025251 {

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

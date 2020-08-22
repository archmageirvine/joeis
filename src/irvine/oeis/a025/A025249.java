package irvine.oeis.a025;

import irvine.math.z.Z;

/**
 * A025249 (1/2)*s(n+3), where s = A025248.
 * @author Sean A. Irvine
 */
public class A025249 extends A025248 {

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

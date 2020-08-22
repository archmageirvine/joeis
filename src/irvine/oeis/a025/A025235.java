package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a014.A014431;

/**
 * A025235 a(n) = (1/2)*s(n+2), where s = A014431.
 * @author Sean A. Irvine
 */
public class A025235 extends A014431 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}

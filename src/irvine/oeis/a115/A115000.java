package irvine.oeis.a115;

import irvine.math.z.Z;
import irvine.oeis.a007.A007434;

/**
 * A115000 a(n) = J_2(n) / 24.
 * @author Sean A. Irvine
 */
public class A115000 extends A007434 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(24);
  }
}

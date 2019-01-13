package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a030.A030197;

/**
 * A007243.
 * @author Sean A. Irvine
 */
public class A007243 extends A030197 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 1 ? Z.ZERO : a;
  }
}

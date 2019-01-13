package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a030.A030182;

/**
 * A007244.
 * @author Sean A. Irvine
 */
public class A007244 extends A030182 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 1 ? Z.ZERO : a;
  }
}

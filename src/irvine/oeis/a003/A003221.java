package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A003221.
 * @author Sean A. Irvine
 */
public class A003221 extends A000166 {

  @Override
  public Z next() {
    final Z m = super.next();
    return m.add((mN & 1) == 1 ? mN - 1 : 1 - mN).divide2();
  }
}

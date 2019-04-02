package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000166;

/**
 * A003221 Number of even permutations of length n with no fixed points.
 * @author Sean A. Irvine
 */
public class A003221 extends A000166 {

  @Override
  public Z next() {
    final Z m = super.next();
    return m.add((mN & 1) == 1 ? mN - 1 : 1 - mN).divide2();
  }
}

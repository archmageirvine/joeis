package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a003.A003180;

/**
 * A000612 Number of P-equivalence classes of switching functions of n or fewer variables, divided by 2.
 * @author Sean A. Irvine
 */
public class A000612 extends A003180 {

  @Override
  public Z next() {
    return super.next().divide(2);
  }
}

package irvine.oeis.a116;

import irvine.math.z.Z;
import irvine.oeis.a036.A036471;

/**
 * A116148 Amicable quadruples: the values of sigma corresponding to A036471-A036474.
 * @author Sean A. Irvine
 */
public class A116148 extends A036471 {

  @Override
  protected Z select(final long[] tuple) {
    return Z.valueOf(tuple[4]);
  }
}

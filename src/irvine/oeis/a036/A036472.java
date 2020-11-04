package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036472 Amicable quadruples: the numbers b referred to in A036471.
 * @author Sean A. Irvine
 */
public class A036472 extends A036471 {

  @Override
  protected Z select(final long[] tuple) {
    return Z.valueOf(tuple[1]);
  }
}

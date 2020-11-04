package irvine.oeis.a036;

import irvine.math.z.Z;

/**
 * A036473 Amicable quadruples: the numbers c referred to in A036471.
 * @author Sean A. Irvine
 */
public class A036473 extends A036471 {

  @Override
  protected Z select(final long[] tuple) {
    return Z.valueOf(tuple[2]);
  }
}

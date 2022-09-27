package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059515 Square array T(k,n) by antidiagonals, where T(k,n) is number of ways of placing n identifiable nonnegative intervals with a total of exactly k starting and/or finishing points.
 * @author Sean A. Irvine
 */
public class A059515 extends A059117 {

  @Override
  protected Z lambda(final int k, final int n) {
    return super.lambda(k, n).add(super.lambda(k + 1, n));
  }
}

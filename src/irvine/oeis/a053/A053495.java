package irvine.oeis.a053;
// manually at 2021-11-09

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A053495 Triangle formed by coefficients of numerator polynomials defined by iterating f(u,v) = 1/u - x*v applied to a list of elements {1, 2, 3, 4,...}.
 * @author Georg Fischer
 */
public class A053495 extends Triangle {

  /** Construct the sequence. */
  public A053495() {
    super(1, 1, -1, -1, 2, -2);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n < 3 ? super.compute(n, k) : get(n - 1, k - 1).multiply(n).add(get(n - 2, k));
  }
}

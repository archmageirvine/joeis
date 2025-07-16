package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385733 Triangle of Lucas coefficients, read by rows: denominators.
 * @author Georg Fischer
 */
public class A385733 extends A385732 {

  @Override
  protected Z compute(final int n, final int k) {
    return super.computeQ(n, k).den();
  }
}

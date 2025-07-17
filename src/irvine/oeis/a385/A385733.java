package irvine.oeis.a385;

import irvine.math.z.Z;

/**
 * A385733 Triangle read by rows: the denominators of the Lucas triangle.
 * @author Georg Fischer
 */
public class A385733 extends A385732 {

  @Override
  protected Z compute(final int n, final int k) {
    return super.computeQ(n, k).den();
  }
}

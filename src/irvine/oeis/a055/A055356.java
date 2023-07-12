package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A055356 Triangle of increasing mobiles (circular rooted trees) with n nodes and k leaves.
 * @author Georg Fischer
 */
public class A055356 extends Triangle {

  /** Construct the sequence. */
  public A055356() {
    setOffset(1);
    hasRAM(false);
  }

  @Override
  protected Z compute(final int n, final int k) {
    return n == 0 ? Z.ONE : get(n - 1, k).multiply(k + 1).add(get(n - 1, k - 1).multiply(n - 1));
  }
}

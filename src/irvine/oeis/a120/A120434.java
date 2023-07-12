package irvine.oeis.a120;

import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A120434 Triangle read by rows: counts permutations by number of big descents.
 * @author Georg Fischer
 */
public class A120434 extends Triangle {

  /** Construct the sequence. */
  public A120434() {
    super(2);
    setOffset(2);
    hasRAM(false);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n == k ? Z.TWO : get(n - 1, k - 1).multiply(n + 1 - k).add(get(n - 1, k).multiply(k + 2));
  }
}

package irvine.oeis.a092;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A092181 Figurate numbers based on the 24-cell (4-D polytope with Schlaefli symbol {3,4,3}).
 * <code>a(n) = n^2*(3*n^2 - 4*n + 2)</code>
 * @author Sean A. Irvine
 */
public class A092181 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A092181() {
    super(0, new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 24, 153, 544});
  }

  @Override
  public Z a(final Z n) {
    final Z n2 = n.square();
    return n2.multiply(n2.multiply(3).subtract(n.multiply(4)).add(2));
  }

  @Override
  public Z a(final long n) {
    final Z n2 = Z.valueOf(n).multiply(n);
    return n2.multiply(n2.multiply(3).subtract(4 * n - 2));
  }

}

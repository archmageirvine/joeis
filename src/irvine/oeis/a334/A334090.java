package irvine.oeis.a334;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a064.A064097;

/**
 * A334090 a(1) = 0, and then after the first differences of A064097.
 * @author Georg Fischer
 */
public class A334090 extends DifferenceSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A334090() {
    super(1, new A064097());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ZERO : super.next();
  }
}

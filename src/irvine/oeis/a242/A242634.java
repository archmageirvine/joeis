package irvine.oeis.a242;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a088.A088585;

/**
 * A242634 G.f. A(x) satisfies A(x) = A(x^2) / (1 - x) + x / (1 - x^2).
 * @author Georg Fischer
 */
public class A242634 extends DifferenceSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A242634() {
    super(0, new A088585());
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : super.next();
  }
}

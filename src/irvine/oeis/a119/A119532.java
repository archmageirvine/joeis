package irvine.oeis.a119;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000105;
import irvine.oeis.a000.A000577;

/**
 * A119532 Number of n-ominoes plus number of n-iamonds.
 * @author Georg Fischer
 */
public class A119532 extends AbstractSequence {

  private int mN = -1;
  private final A000105 mSeq1 = new A000105();
  private final A000577 mSeq2 = new A000577();

  /** Construct the sequence. */
  public A119532() {
    super(0);
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.TWO : mSeq1.next().add(mSeq2.next());
  }
}

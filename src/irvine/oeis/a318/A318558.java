package irvine.oeis.a318;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a060.A060426;
import irvine.oeis.a060.A060437;

/**
 * A318558 Number of degrees of irreducible representations of symmetric group S_n that appear more than once.
 * @author Georg Fischer
 */
public class A318558 extends AbstractSequence {

  private int mN = -1;
  private final A060437 mSeq1 = new A060437();
  private final A060426 mSeq2 = new A060426();

  /** Construct the sequence. */
  public A318558() {
    super(0);
    mSeq2.next();
    mSeq1.next();
  }

  @Override
  public Z next() {
    return (++mN <= 1) ? Z.ZERO : mSeq1.next().subtract(mSeq2.next());
  }
}

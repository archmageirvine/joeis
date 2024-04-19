package irvine.oeis.a348;
// manually anopan 0,0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006717;
import irvine.oeis.a011.A011655;

/**
 * A348212 Number of transversals in a cyclic diagonal Latin square of order 2n+1.
 * @author Georg Fischer
 */
public class A348212 extends AbstractSequence {

  private final A006717 mSeq1 = new A006717();
  private final A011655 mSeq2 = new A011655();

  /** Construct the sequence. */
  public A348212() {
    super(1);
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mSeq2.next());
  }
}

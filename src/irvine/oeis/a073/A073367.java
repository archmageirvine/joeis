package irvine.oeis.a073;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a065.A065855;

/**
 * A073367 Remainder when n-th composite is divided by number of composites not exceeding n.
 * @author Georg Fischer
 */
public class A073367 extends AbstractSequence {

  private final A002808 mSeq1 = new A002808();
  private final A065855 mSeq2 = new A065855();

  /** Construct the sequence. */
  public A073367() {
    super(4);
    mSeq1.next();
    mSeq1.next();
    mSeq1.next();
    mSeq2.next();
    mSeq2.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().mod(mSeq2.next());
  }
}


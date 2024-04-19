package irvine.oeis.a073;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007821;
import irvine.oeis.a022.A022449;

/**
 * A073168 a(n) = A007821(n) - A022449(n).
 * @author Georg Fischer
 */
public class A073168 extends AbstractSequence {

  private final A007821 mSeq1 = new A007821();
  private final A022449 mSeq2 = new A022449();

  /** Construct the sequence. */
  public A073168() {
    super(1);
    mSeq1.next();
    mSeq2.next();
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

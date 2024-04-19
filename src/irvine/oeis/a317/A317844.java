package irvine.oeis.a317;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a294.A294898;
import irvine.oeis.a297.A297114;

/**
 * A317844 Difference between A294898 and its M\u00f6bius transform (A297114).
 * @author Georg Fischer
 */
public class A317844 extends AbstractSequence {

  private final A294898 mSeq1 = new A294898();
  private final A297114 mSeq2 = new A297114();

  /** Construct the sequence. */
  public A317844() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}

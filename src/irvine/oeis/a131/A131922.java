package irvine.oeis.a131;
// manually trisum/trisum2 at 2023-06-08 08:30

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a002.A002024;
import irvine.oeis.a130.A130296;

/**
 * A131922 2*A002024 - A130296.
 * @author Georg Fischer
 */
public class A131922 extends AbstractSequence {

  private final A002024 mSeq1 = new A002024();
  private final A130296 mSeq2 = new A130296();

  /** Construct the sequence. */
  public A131922() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply2().subtract(mSeq2.next());
  }
}

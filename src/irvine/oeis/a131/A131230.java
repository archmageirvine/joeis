package irvine.oeis.a131;
// manually trisum/trisum2 at 2023-06-08 08:30

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a128.A128174;
import irvine.oeis.a130.A130296;

/**
 * A131230 2*A130296 - A128174.
 * @author Georg Fischer
 */
public class A131230 extends AbstractSequence {

  private final long mFactor1 = 2;
  private final long mFactor2 = -1;
  private final A130296 mSeq1 = new A130296();
  private final A128174 mSeq2 = new A128174();

  /** Construct the sequence. */
  public A131230() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().multiply(mFactor1).add(mSeq2.next().multiply(mFactor2));
  }
}

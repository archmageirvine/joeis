package irvine.oeis.a289;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005430;
import irvine.oeis.a006.A006004;

/**
 * A289718 The order of the semigroup of orientation-preserving or reserving full transformations of n elements.
 * @author Georg Fischer
 */
public class A289718 extends AbstractSequence {

  private final A005430 mSeq1 = new A005430();
  private final A006004 mSeq2 = new A006004();
  private long mN;

  /** Construct the sequence. */
  public A289718() {
    super(1);
    mN = 0;
    mSeq1.next();
  }

  @Override
  public Z next() {
    // a(n) = A005430(n)-n*A006004(n).
    ++mN;
    return mSeq1.next().subtract(mSeq2.next().multiply(mN));
  }
}

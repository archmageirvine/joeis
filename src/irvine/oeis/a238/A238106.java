package irvine.oeis.a238;
// manually seqop at 2023-06-02 22:41

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A238106 a(n) = A238104(n)/9.
 * @author Georg Fischer
 */
public class A238106 extends AbstractSequence {

  private int mN = 2;
  private final A238104 mSeq = new A238104();

  /** Construct the sequence. */
  public A238106() {
    super(3);
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().divide(9);
  }
}

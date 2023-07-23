package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059140 A hierarchical sequence (S(W2{2}*c) - see A059126).
 * @author Sean A. Irvine
 */
public class A059140 extends AbstractSequence {

  private final A059139 mSeq1 = new A059139();

  /** Construct the sequence. */
  public A059140() {
    super(0);
  }

  private int mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    final long lim = 1L << mN;
    while (m < lim) {
      mSum = mSum.add(mSeq1.next());
      ++m;
    }
    return mSum;
  }
}


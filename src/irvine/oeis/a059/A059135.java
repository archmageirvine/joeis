package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059135 A hierarchical sequence (S(W2{3}c) - see A059126).
 * @author Sean A. Irvine
 */
public class A059135 extends AbstractSequence {

  private final A059127 mSeq1 = new A059127();

  /** Construct the sequence. */
  public A059135() {
    super(0);
  }

  private int mN = -1;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    final long lim = 7L << mN;
    while (m < lim) {
      mSum = mSum.add(mSeq1.next());
      ++m;
    }
    return mSum;
  }
}


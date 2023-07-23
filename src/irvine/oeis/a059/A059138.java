package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A059138 A hierarchical sequence (S(W3{2,2}cc) - see A059126).
 * @author Sean A. Irvine
 */
public class A059138 extends AbstractSequence {

  private final A059137 mSeq1 = new A059137();

  /** Construct the sequence. */
  public A059138() {
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


package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A151844 If A151843 is regarded as a triangle then the rows converge to this sequence.
 * @author Georg Fischer
 */
public class A151844 extends Sequence0 {

  private int mISeq; // index in mSeq
  private int mHi; // higher bound of range
  private final A151843 mSeq;

  /** Construct the sequence. */
  public A151844() {
    this(new A151843());
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   */
  public A151844(final A151843 seq) {
    mSeq = seq;
    mHi = 8;
    mISeq = 3; // one less than a power of 2
  }

  /*
0:  0, 
1:  0, 
2:  0, 1, 
4:  0, 0, 1, 2, 
8:  0, 0, 1, 1, 0, 1, 3, 3, 
16: 0, 0, 1, 1, 0, 1, 3, 2, 0, 1, 2, 1, 1, 4, 6, 4, 
32: 0, 0, 1, 1, 0, 1, 3, 2, 0, 1, 2, 1, 1, 4, 6, 3, 0, 1, 2, 1, 1, 4, 5, 2, 1, 3, 3, 2, 5, 10, 10, 5, 0
    wrong:               1        3              2                    6
  */
  @Override
  public Z next() {
    ++mISeq;
    if (mISeq == mHi - 1) {
      final int lo = mHi / 2 * 3;
      mHi *= 2;
      mISeq = lo - 1;
      // System.out.println("width=" + width + ", lo=" + lo + ", mHi=" + mHi + ", mISeq=" + mISeq);
    }
    return mSeq.a(mISeq);
  }
}

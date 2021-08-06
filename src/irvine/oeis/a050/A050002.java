package irvine.oeis.a050;
// manually 2021-08-06

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050002 Numbers k such that A050000(k) &lt; A050000(k+1). 
 * @author Georg Fischer
 */
public class A050002 implements Sequence {

  protected int mN;
  protected Sequence mSeq;
  protected Z mNext;

  /** Construct the sequence. */
  public A050002() {
    this(new A050000());
  }

  /**
   * Generic constructor with parameter
   * @param seq underlying sequence
   */
  public A050002(final Sequence seq) {
    mN = 0;
    mSeq = seq;
    mNext = seq.next();
  }

  @Override
  public Z next() {
    ++mN;
    Z curr = mNext;
    mNext = mSeq.next();
    while (curr.compareTo(mNext) >= 0) {
      ++mN;
      curr = mNext;
      mNext = mSeq.next();
    }
    return Z.valueOf(mN);
  }
}

package irvine.oeis.a205;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a204.A204922;

/**
 * A205556 Positions of multiples of 2 in A204922 (differences of Fibonacci numbers).
 * @author Georg Fischer
 */
public class A205556 extends Sequence1 {

  private int mK;
  private Sequence mSeq;
  private Z mMult;

  /** Construct the sequence. */
  public A205556() {
    this(new A204922(), 2);
  }

  /**
   * Generic constructor with parameters
   * @param seq underlying sequence
   * @param mult find multiples of this number
   */
  public A205556(final Sequence seq, final int mult) {
    mK = 0;
    mSeq = seq;
    mMult = Z.valueOf(mult);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (mSeq.next().remainder(mMult).isZero()) {
        return Z.valueOf(mK);
      }
    }
  }
}

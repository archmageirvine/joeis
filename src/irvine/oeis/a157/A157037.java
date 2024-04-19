package irvine.oeis.a157;

import java.util.function.BiFunction;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003415;

/**
 * A157037 Numbers with prime arithmetic derivative A003415.
 * @author Georg Fischer
 */
public class A157037 extends AbstractSequence {

  private long mN;
  private final AbstractSequence mSeq;
  private final BiFunction<Long, Z, Boolean> mLambda; // (n, t) -> condition

  /** Construct the sequence. */
  public A157037() {
    this(1, new A003415(), (n, t) -> t.isProbablePrime());
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param seq underlying sequence
   * @param lambda condition for n, t
   */
  public A157037(final int offset, final AbstractSequence seq, final BiFunction<Long, Z, Boolean> lambda) {
    super(offset);
    mN = seq.getOffset() - 1;
    mSeq = seq;
    mLambda = lambda;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mLambda.apply(mN, mSeq.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

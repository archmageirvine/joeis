package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a000.A000045;

/**
 * A337232 Even composite integers m such that F(m)^2 == 1 (mod m), where F(m) is the m-th Fibonacci number.
 * @author Georg Fischer
 */
public class A337232 implements SequenceWithOffset {

  private int mK; // even numbers
  private int mOffset;
  private MemorySequence mSeq;
  private int mExp;
  private Z mMod;

  /** Construct the sequence. */
  public A337232() {
    this(1, new A000045(), 2, 1);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq underlying sequence
   * @param exp exponent
   * @param mod modulus
   */
  public A337232(final int offset, final Sequence seq, final int exp, final int mod) {
    mK = 2;
    mOffset = offset;
    mSeq = MemorySequence.cachedSequence(seq);
    mExp = exp;
    mMod = Z.valueOf(mod);
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      mK += 2;
      final Z m = Z.valueOf(mK);
      Z val = mSeq.a(mK);
      if (mExp > 1) {
        val = val.pow(mExp);
      }
      if (val.subtract(mMod).remainder(m).isZero()) {
        return m;
      }
    }
  }
}

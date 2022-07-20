package irvine.oeis.a335;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a002.A002808;
import irvine.oeis.a003.A003500;

/**
 * A335673 Composite integers m such that A003500(m) == 4 (mod m).
 * @author Georg Fischer
 */
public class A335673 extends A002808 implements SequenceWithOffset {

  private int mK;
  private int mOffset;
  private MemorySequence mSeq;
  private int mExp;
  private Z mMod;

  /** Construct the sequence. */
  public A335673() {
    this(1, new A003500(), 1, 4);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq underlying sequence
   * @param exp exponent
   * @param mod modulus
   */
  public A335673(final int offset, final Sequence seq, final int exp, final int mod) {
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
      final Z m = super.next();
      mK = m.intValueExact();
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

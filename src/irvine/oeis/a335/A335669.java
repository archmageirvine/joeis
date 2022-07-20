package irvine.oeis.a335;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceWithOffset;
import irvine.oeis.a006.A006497;
import irvine.oeis.a014.A014076;

/**
 * A335669 Odd composite integers m such that A006497(m) == 3 (mod m).
 * @author Georg Fischer
 */
public class A335669 extends A014076 implements SequenceWithOffset {

  private int mK;
  private int mOffset;
  private MemorySequence mSeq;
  private int mExp;
  private Z mMod;

  /** Construct the sequence. */
  public A335669() {
    this(1, new A006497(), 1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq underlying sequence
   * @param exp exponent
   * @param mod modulus
   */
  public A335669(final int offset, final Sequence seq, final int exp, final int mod) {
    super.next(); // skip 1
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
      //  if (val.mod(m).equals(mMod)) {
      if (val.subtract(mMod).remainder(m).isZero()) {
        return m;
      }
    }
  }
}

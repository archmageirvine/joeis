package irvine.oeis.a335;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a006.A006497;
import irvine.oeis.a014.A014076;

/**
 * A335669 Odd composite integers m such that A006497(m) == 3 (mod m).
 * @author Georg Fischer
 */
public class A335669 extends A014076 {

  private final MemorySequence mSeq;
  private final int mExp;
  private final Z mMod;

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
    setOffset(offset);
    mSeq = MemorySequence.cachedSequence(seq);
    mExp = exp;
    mMod = Z.valueOf(mod);
  }

  @Override
  public Z next() {
    while (true) {
      final Z m = super.next();
      final int k = m.intValueExact();
      Z val = mSeq.a(k);
      if (mExp > 1) {
        val = val.pow(mExp);
      }
      if (val.subtract(mMod).remainder(m).isZero()) {
        return m;
      }
    }
  }
}

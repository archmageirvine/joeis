package irvine.oeis.a335;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a003.A003500;

/**
 * A335673 Composite integers m such that A003500(m) == 4 (mod m).
 * @author Georg Fischer
 */
public class A335673 extends A002808 {

  private final MemorySequence mSeq;
  private final int mExp;
  private final Z mMod;

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
    mSeq = MemorySequence.cachedSequence(seq);
    mExp = exp;
    mMod = Z.valueOf(mod);
    setOffset(offset);
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

package irvine.oeis.a337;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001906;
import irvine.oeis.a005.A005248;

/**
 * A337777 Even composite integers m such that U(m)^2 == 1 (mod m) and V(m) == 3 (mod m), where U(m)=A001906(m) and V(m)=A005248(m) are the m-th generalized Lucas and Pell-Lucas numbers of parameters a=3 and b=1, respectively.
 * @author Georg Fischer
 */
public class A337777 extends AbstractSequence {

  private int mK; // even numbers
  private final MemorySequence mSeq1;
  private final int mExp;
  private final Z mMod1;
  private final MemorySequence mSeq2;
  private final Z mMod2;

  /** Construct the sequence. */
  public A337777() {
    this(1, new A001906(), 2, 1, new A005248(), 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset index of first term
   * @param seq1 first underlying sequence
   * @param exp exponent
   * @param mod1 first modulus
   * @param seq2 second underlying sequence
   * @param mod2 second modulus
   */
  public A337777(final int offset, final Sequence seq1, final int exp, final int mod1, final Sequence seq2, final int mod2) {
    super(offset);
    mK = 2;
    mSeq1 = MemorySequence.cachedSequence(seq1);
    mSeq2 = MemorySequence.cachedSequence(seq2);
    mExp = exp;
    mMod1 = Z.valueOf(mod1);
    mMod2 = Z.valueOf(mod2);
  }

  @Override
  public Z next() {
    while (true) {
      mK += 2;
      final Z m = Z.valueOf(mK);
      Z val = mSeq1.a(mK);
      if (mExp > 1) {
        val = val.pow(mExp);
      }
      if (val.subtract(mMod1).remainder(m).isZero() && mSeq2.a(mK).subtract(mMod2).remainder(m).isZero()) {
        return m;
      }
    }
  }
}

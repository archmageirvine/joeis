package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A386800 Numbers that have exactly one exponent in their prime factorization that is equal to 3.
 * @author Georg Fischer
 */
public class A386800 extends AbstractSequence {

  private Z mN;
  private final int mExpon;
  private final int mOccur;
  private static final Z[] PRIMES = {Z.TWO, Z.THREE, Z.FIVE, Z.SEVEN};

  /** Construct the sequence. */
  public A386800() {
    this(1, 3, 1);
  }

  /**
   * Generic constructor with parameters
   * @param expon exponent that is counted
   * @param occur required number of occurrences
   */
  public A386800(final int offset, final int expon, final int occur) {
    super(offset);
    mExpon = expon;
    mOccur = occur;
    mN = Z.ONE;
    if (mOccur > 0) {
      for (int iocc = 0; iocc < mOccur; ++iocc) {
        mN = mN.multiply(PRIMES[iocc].pow(mExpon));
      }
    }
    mN = mN.subtract(Z.ONE);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final FactorSequence fs = Jaguar.factor(mN);
      int count = 0;
      for (Z p : fs.toZArray()) {
        if (fs.getExponent(p) == mExpon) {
          ++count;
        }
      }
      if (count == mOccur) {
        return mN;
      }
    }
  }
}

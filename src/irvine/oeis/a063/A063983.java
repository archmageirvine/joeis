package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A063983 Least k such that k*2^n +/- 1 are twin primes.
 * @author Georg Fischer
 */
public class A063983 extends AbstractSequence {

  private int mN;
  private final Z mBase;

  /** Construct the sequence. */
  public A063983() {
    this(0, 2);
  }

  /**
   * Generic constructor with parameters
   * @param base empower this by mN
   */
  public A063983(final int offset, final int base) {
    super(0);
    mN = offset - 1;
    mBase = Z.valueOf(base);
  }

  @Override
  public Z next() {
    ++mN;
    int k = 0;
    while (true) {
      ++k;
      final Z cand1 = mBase.pow(mN).multiply(k).add(1);
      final Z cand9 = cand1.subtract(2);
      if (cand1.isProbablePrime() && cand9.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

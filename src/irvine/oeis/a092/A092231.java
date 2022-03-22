package irvine.oeis.a092;

import irvine.math.z.Z;

/**
 * A092231 Numbers k such that numerator of Bernoulli(2*k) is divisible by 37 and 59, the first two irregular primes.
 * @author Georg Fischer
 */
public class A092231 extends A092221 {

  /** Construct the sequence. */
  public A092231() {
    super(37);
  }

  /**
   * Test the condition.
   * @param n current index
   * @return true if the condition is met, or false otherwise.
   */
  protected boolean isOk(final long n) {
    mBern.nextQ();
    final Z bnum = mBern.nextQ().num();
    return bnum.mod(mDiv) == 0 && bnum.mod(59) == 0;
  }

}

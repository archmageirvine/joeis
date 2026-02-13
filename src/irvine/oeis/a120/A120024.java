package irvine.oeis.a120;
// manually 2026-02-13/filnum at 2026-02-13 16:08

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A120024 Numbers k such that 2*6^k-1 and 2*6^k+1 are twin primes.
 * @author Georg Fischer
 */
public class A120024 extends AbstractSequence {

  private Z mPow62 = Z.TWO;
  private int mK = 0;

  /** Construct the sequence. */
  public A120024() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mK;
      mPow62 = mPow62.multiply(6);
      if (Predicates.PRIME.is(mPow62.subtract(1)) && Predicates.PRIME.is(mPow62.add(1))) {
        return Z.valueOf(mK);
      }
    }
  }
}

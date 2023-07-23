package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A049848 a(n) is the number of primes q less than n-th prime p for which the Euclidean algorithm for p,q has exactly 2 nonzero remainders.
 * @author Sean A. Irvine
 */
public class A049848 extends AbstractSequence {

  private final A049843 mSeq1 = new A049843();

  /** Construct the sequence. */
  public A049848() {
    super(1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    long cnt = 0;
    for (long k = 0; k < mN; ++k) {
      if (mSeq1.next().equals(Z.TWO)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

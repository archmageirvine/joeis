package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.PositionOfNSequence;

/**
 * A038028.
 * @author Sean A. Irvine
 */
public class A038028 extends PositionOfNSequence {

  private MemorySequence mA038026 = MemorySequence.cachedSequence(new A038026());
  private final Fast mPrime = new Fast();

  /** Construct the sequence. */
  public A038028() {
    super(new A038025(), 4);
  }

  @Override
  public Z next() {
    while (mPrime.isPrime(mN + 1)) {
      ++mN;
    }
    return mA038026.a(super.next().intValueExact() - 1);
  }
}

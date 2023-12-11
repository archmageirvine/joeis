package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.InverseSequence;
import irvine.oeis.memory.MemorySequence;

/**
 * A038028 Position reached by frog in A038027 or 0 if none. A038026(A038027(n)).
 * @author Sean A. Irvine
 */
public class A038028 extends InverseSequence {

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

package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A068549 Largest prime &lt; sqrt(2n-4) - 1.
 * @author Sean A. Irvine
 */
public class A068549 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 9;

  /** Construct the sequence. */
  public A068549() {
    super(10);
  }

  @Override
  public Z next() {
    final long n = 2 * ++mN - 4;
    return Z.valueOf(mPrime.prevPrime(Functions.SQRT.l(n) - 1));
  }
}

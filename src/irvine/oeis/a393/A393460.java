package irvine.oeis.a393;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A393460 a(n) is the least prime p such that n - p is the reverse of a prime, where leading 0's are not allowed, or -1 if there is no such p.
 * @author Sean A. Irvine
 */
public class A393460 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 3;

  /** Construct the sequence. */
  public A393460() {
    super(4);
  }

  @Override
  public Z next() {
    ++mN;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      final long q = mN - p;
      if (q % 10 != 0 && mPrime.isPrime(Functions.REVERSE.l(q))) {
        return Z.valueOf(p);
      }
    }
    return Z.NEG_ONE;
  }
}

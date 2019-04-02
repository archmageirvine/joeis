package irvine.oeis.a163;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000041;

/**
 * A163997 Primes with an even number of partitions.
 * @author Sean A. Irvine
 */
public class A163997 implements Sequence {

  private long mN = -1;
  private final Fast mPrime = new Fast();
  private final A000041 mSeq = new A000041();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z s = mSeq.next();
      if (s.isEven() && mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}


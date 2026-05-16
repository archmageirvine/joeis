package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A395637 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A395637 extends AbstractSequence {

  private final Fast mPrime = new Fast();
  private long mN = 11;

  /** Construct the sequence. */
  public A395637() {
    super(12);
  }

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; 2 * p * p < mN; p = mPrime.nextPrime(p)) {
      final long t = mN - 2 * p * p;
      if (Predicates.SQUARE.is(t)) {
        if (mPrime.isPrime(Functions.SQRT.l(t))) {
          ++cnt;
        }
      } else if (Predicates.SEMIPRIME.is(t)) {
        cnt += 2;
      }
    }
    return Z.valueOf(cnt);
  }
}

package irvine.oeis.a052;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a050.A050443;

/**
 * A052338 a(n) = A050443(n-th prime)/(n-th prime).
 * @author Sean A. Irvine
 */
public class A052338 extends AbstractSequence {

  private final A050443 mSeq1 = new A050443();

  /** Construct the sequence. */
  public A052338() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  protected long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (mPrime.isPrime(++mN)) {
        return t.divide(mN);
      }
    }
  }
}

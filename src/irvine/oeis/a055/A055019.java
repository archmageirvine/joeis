package irvine.oeis.a055;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051885;

/**
 * A055019 Numbers n such that A051885(p_n) is prime, where p_n=A000040(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A055019 extends AbstractSequence {

  private final A051885 mSeq1 = new A051885();

  /** Construct the sequence. */
  public A055019() {
    super(1);
  }

  private final Fast mPrime = new Fast();
  private long mN = -1;
  private long mPi = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (mPrime.isPrime(++mN)) {
        ++mPi;
        if (t.isProbablePrime()) {
          return Z.valueOf(mPi);
        }
      }
    }
  }
}

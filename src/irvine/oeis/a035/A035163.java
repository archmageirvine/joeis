package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A035163 Composite numbers k, not a power of 2, such that the E(k) == 1 (mod k), where E(k) is the k-th Euler number (A000364).
 * @author Sean A. Irvine
 */
public class A035163 extends A000364 {

  /** Construct the sequence. */
  public A035163() {
    super(1);
  }

  {
    super.next(); // skip 0
  }

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      if (super.next().mod(++mN) == 1 && (mN & (mN - 1)) != 0 && !mPrime.isPrime(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}


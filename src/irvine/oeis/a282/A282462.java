package irvine.oeis.a282;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A282462 Integers but with the primes cubed.
 *
 * @author Karsten Knuth
 */
public class A282462 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final Z current = Z.valueOf(mN++);
    if (mPrime.isPrime(current)) {
      return current.pow(3);
    }

    return current;
  }
}

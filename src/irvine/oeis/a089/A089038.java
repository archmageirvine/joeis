package irvine.oeis.a089;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A089038 Nonnegative numbers k such that 2k+5 is prime.
 *
 * @author Karsten Knuth
 */
public class A089038 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long current = mN++;
      if (mPrime.isPrime(Z.valueOf(current).multiply2().add(5))) {
        return Z.valueOf(current);
      }
    }
  }
}

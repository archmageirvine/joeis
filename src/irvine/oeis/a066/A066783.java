package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066783 Integers of the form (prime(k)+1)/phi(k), by order of appearance.
 * @author Sean A. Irvine
 */
public class A066783 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long n = ++mN;
      final long phi = Functions.PHI.l(n);
      if ((mP + 1) % phi == 0) {
        return Z.valueOf((mP + 1) / phi);
      }
    }
  }
}


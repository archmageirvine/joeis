package irvine.oeis.a328;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A328784 Integers k such that the k-th prime divides the k-th Lucas number.
 * @author Sean A. Irvine
 */
public class A328784 extends A000032 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 1;
  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (super.next().mod(mP) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

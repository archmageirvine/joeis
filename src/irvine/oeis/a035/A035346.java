package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A035346 Let F(n) = Q(n) - P(n) be the Fortunate numbers (A005235); sequence gives n such that F(n) = prime(n+1).
 * @author Sean A. Irvine
 */
public class A035346 extends A002110 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (super.next().add(mP).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}


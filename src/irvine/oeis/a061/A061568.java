package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.a007.A007504;

/**
 * A060284.
 * @author Sean A. Irvine
 */
public class A061568 extends A007504 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private Z mP = Z.TWO;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z p = super.next();
    while (mP.compareTo(p) <= 0) {
      mP = mPrime.nextPrime(mP);
      ++mN;
    }
    return Z.valueOf(mN);
  }
}


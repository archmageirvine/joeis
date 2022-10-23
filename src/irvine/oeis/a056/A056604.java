package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A056604 a(0)=1; thereafter a(n) = lcm(1, 2, 3, 4, ..., prime(n)).
 * @author Sean A. Irvine
 */
public class A056604 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private Z mA = null;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      do {
        mA = mA.lcm(Z.valueOf(++mN));
      } while (!mPrime.isPrime(mN));
    }
    return mA;
  }
}


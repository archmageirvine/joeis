package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079068 Largest prime less than greatest prime factor of n but not dividing n, or 1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A079068 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long res = Functions.GPF.l(++mN);
    while (res != 1) {
      res = mPrime.prevPrime(res);
      if (res == 0 || mN % res != 0) {
        break;
      }
    }
    return Z.valueOf(res).max(Z.ONE);
  }
}


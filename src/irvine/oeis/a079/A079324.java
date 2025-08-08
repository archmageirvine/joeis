package irvine.oeis.a079;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079324 k such that 2kp+1 is the first factor of a nonprime Mersenne number M(p) = 2^p - 1.
 * @author Sean A. Irvine
 */
public class A079324 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z v = Z.ONE.shiftLeft(mP).subtract(1);
      if (!v.isProbablePrime()) {
        return Functions.LPF.z(v).subtract(1).divide(2L * mP);
      }
    }
  }
}

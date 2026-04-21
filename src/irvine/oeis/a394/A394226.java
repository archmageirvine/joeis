package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A394226 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A394226 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z start = mP.pow(5);
    mP = mPrime.nextPrime(mP);
    final Z end = mP.pow(5);
    long cnt = 0;
    for (Z k = start; k.compareTo(end) < 0; k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == 6) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

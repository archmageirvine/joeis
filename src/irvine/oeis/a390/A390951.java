package irvine.oeis.a390;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390951 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A390951 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    final Z start = mP.pow(3);
    mP = mPrime.nextPrime(mP);
    final Z end = mP.pow(3);
    long cnt = 0;
    for (Z k = start; k.compareTo(end) < 0; k = k.add(1)) {
      if (Functions.SIGMA0.l(k) == 4) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

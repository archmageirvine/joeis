package irvine.oeis.a389;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A389257 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A389257 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      final Z num = Z.ONE.shiftLeft(mN).subtract(1).pow(p).add(1);
      final Z t = num.makeOdd();
      if (t.auxiliary() == mN && t.isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}

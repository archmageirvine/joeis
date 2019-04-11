package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;

import irvine.factor.factor.Cheetah;

/**
 * A002200 Primes of the form 2^q*3^r*5^s <code>+ 1</code>.
 * @author Sean A. Irvine
 */
public class A002200 implements Sequence {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final FactorSequence fs = Cheetah.factor(mP.subtract(1));
      if (fs.omega() <= 3) {
        boolean ok = true;
        for (final Z z : fs.toZArray()) {
          if (z.compareTo(Z.TWO) < 0 || z.compareTo(Z.FIVE) > 0) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return mP;
        }
      }
    }
  }
}

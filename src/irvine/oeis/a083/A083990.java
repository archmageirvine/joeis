package irvine.oeis.a083;
// manually at 2024-03-18

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a178.A178914;

/**
 * A083990 Primes arising in A083989.
 * @author Georg Fischer
 */
public class A083990 extends Sequence1 {

  protected Z mP = Z.ONE;
  protected final Fast mPrime = new Fast();
  private final A178914 mTensComplement = new A178914(); // 10's complement

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z conc = new Z(mP.toString() + mTensComplement.a(mP).toString());
      if (conc.isProbablePrime()) {
        return conc;
      }
    }
  }
}

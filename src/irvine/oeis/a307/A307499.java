package irvine.oeis.a307;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307499 The number of primes between two consecutive prime Lucas numbers, bounds excluded.
 * @author Sean A. Irvine
 */
public class A307499 implements Sequence {

  private Z mP = Z.THREE;

  @Override
  public Z next() {
    long k = 1;
    while (true) {
      final Z t = mP.multiply(mP.subtract(1)).multiply(k);
      final Z runP = t.subtract(1);
      if (runP.isProbablePrime() && t.add(1).isProbablePrime()) {
        mP = runP;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

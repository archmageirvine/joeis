package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050522 Primes of form 5*2^n-1.
 * @author Sean A. Irvine
 */
public class A050522 extends Sequence1 {

  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mP.shiftLeft(2);
      final Z t = mP.subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

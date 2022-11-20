package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060425 Primes of form n*4^n - 1.
 * @author Sean A. Irvine
 */
public class A060425 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.valueOf(++mN).shiftLeft(2 * mN).subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

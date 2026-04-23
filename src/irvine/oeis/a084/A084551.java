package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084551 Primes which are a concatenation of five consecutive numbers.
 * @author Sean A. Irvine
 */
public class A084551 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(String.valueOf(++mN) + String.valueOf(mN + 1) + String.valueOf(mN + 2) + String.valueOf(mN + 3) + String.valueOf(mN + 4));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

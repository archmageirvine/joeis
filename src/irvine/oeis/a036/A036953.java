package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A036953 Primes having only {0, 1, 2} as digits.
 * @author Sean A. Irvine
 */
public class A036953 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z t = new Z(Long.toString(++mN, 3));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

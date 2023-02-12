package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061372 Primes having only 0,4,6,8,9 as digits.
 * @author Sean A. Irvine
 */
public class A061372 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final String s = Long.toString(++mN, 5).replace('2', '6').replace('3', '8').replace('4', '9').replace('1', '4');
      final Z t = new Z(s).multiply(10).add(9);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}


package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060981 Primes of the form 4k^2 - 152k + 1487 + (6k - 114)*(-1)^k.
 * @author Sean A. Irvine
 */
public class A060981 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z k = Z.valueOf(++mN);
      final Z t = k.multiply(4).subtract(152).multiply(k).add(1487).signedAdd((mN & 1) == 0, k.multiply(6).subtract(114));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

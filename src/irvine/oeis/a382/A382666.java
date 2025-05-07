package irvine.oeis.a382;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A382666 Smallest k such that 7^(7^n) - k is prime.
 * @author Sean A. Irvine
 */
public class A382666 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.SEVEN.pow(Z.SEVEN.pow(++mN));
    long k = 0;
    while (true) {
      final Z u = t.subtract(++k);
      if (u.isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

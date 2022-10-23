package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035092 Smallest k such that (n^2)*k + 1 is prime.
 * @author Sean A. Irvine
 */
public class A035092 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      if (k.multiply(s).add(1).isProbablePrime()) {
        return k;
      }
    }
  }
}

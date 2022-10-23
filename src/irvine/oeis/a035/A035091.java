package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035091 Smallest prime == 1 mod (n^2).
 * @author Sean A. Irvine
 */
public class A035091 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Z.valueOf(++mN).square();
    Z k = Z.ZERO;
    while (true) {
      k = k.add(1);
      final Z t = k.multiply(s).add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

package irvine.oeis.a086;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400199.
 * @author Sean A. Irvine
 */
public class A086778 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN == 2) {
      return Z.valueOf(144);
    } else {
      final Z t0 = Z.FIVE.pow(mN - 1);
      final Z t1 = t0.multiply(5);
      return Integers.SINGLETON.product(0, mN - 2, k -> t1.subtract(Z.FIVE.pow(k)).square())
        .divide(Integers.SINGLETON.product(0, mN - 2, k -> t0.subtract(Z.FIVE.pow(k))));
    }
  }
}


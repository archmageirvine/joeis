package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065103 A level 11 weight 5 form.
 * @author Sean A. Irvine
 */
public class A065103 extends Sequence1 {

  private static final Z Z11 = Z.valueOf(11);
  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      final int j = d.jacobi(Z11);
      if (j != 0) {
        sum = sum.signedAdd(j > 0, Z.valueOf(mN).divide(d).pow(4));
      }
    }
    return sum;
  }
}

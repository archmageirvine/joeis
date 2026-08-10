package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A011947 Number of Barlow packings with group P63/mmc(O) that repeat after 4n+2 layers.
 * @author Sean A. Irvine
 */
public class A011947 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int m = 2 * ++mN + 1;
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(m).divisors()) {
      final int dd = d.intValue();
      sum = sum.add(Z.ONE.shiftLeft((dd - 1) / 2).multiply(Functions.MOBIUS.i(m / dd)));
    }
    return sum;
  }
}

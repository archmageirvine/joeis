package irvine.oeis.a011;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011946 Number of Barlow packings with group P63/mmc(S) that repeat after 4n layers.
 * @author Sean A. Irvine
 */
public class A011946 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.isOdd()) {
        final long dd = d.longValue();
        sum = sum.add(Z.valueOf(Mobius.mobius(dd)).shiftLeft(mN / dd - 1));
      }
    }
    return sum;
  }
}

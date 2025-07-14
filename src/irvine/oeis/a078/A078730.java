package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078730 Sum of products of two successive divisors of n.
 * @author Sean A. Irvine
 */
public class A078730 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    Z t = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      sum = sum.add(d.multiply(t));
      t = d;
    }
    return sum;
  }
}

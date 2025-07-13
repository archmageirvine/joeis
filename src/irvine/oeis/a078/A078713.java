package irvine.oeis.a078;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078713 Sum of squares of the distances between successive divisors of n.
 * @author Sean A. Irvine
 */
public class A078713 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sx2 = Z.ZERO;
    Z t = Z.ONE;
    for (final Z d : Jaguar.factor(++mN).divisorsSorted()) {
      sx2 = sx2.add(d.subtract(t).square());
      t = d;
    }
    return sx2;
  }
}

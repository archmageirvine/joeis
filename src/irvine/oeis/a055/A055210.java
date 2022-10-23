package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055210 Sum of totients of square divisors of n.
 * @author Sean A. Irvine
 */
public class A055210 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      if (d.isSquare()) {
        sum = sum.add(Euler.phi(d));
      }
    }
    return sum;
  }
}

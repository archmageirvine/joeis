package irvine.oeis.a165;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A165920 Number of 2-elements orbits of S3 action on irreducible polynomials of degree 3n, n &gt; 0, over GF(2).
 * @author Sean A. Irvine
 */
public class A165920 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      if ((mN / d) % 3 != 0) {
        sum = sum.add(Z.ONE.shiftLeft(d).signedAdd((d & 1) == 0, Z.NEG_ONE).multiply(Functions.MOBIUS.i((long) (mN / d))));
      }
    }
    return sum.divide(3L * mN);
  }
}

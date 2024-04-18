package irvine.oeis.a056;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056341 Number of bracelets of length n using a maximum of six different colored beads.
 * @author Sean A. Irvine
 */
public class A056341 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Functions.PHI.z(dd).multiply(Z.SIX.pow(mN / dd.longValue())));
    }
    return sum.divide(mN).add((mN & 1) == 0 ? Z.SIX.pow(mN / 2).multiply(7).divide2() : Z.SIX.pow((mN + 1) / 2)).divide2();
  }
}

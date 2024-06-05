package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054663 Number of monic irreducible polynomials over GF(5) with zero trace.
 * @author Sean A. Irvine
 */
public class A054663 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.FIVE.pow(mN / d).multiply(Functions.GCD.i(d, 5)).multiply(Functions.MOBIUS.i(d))).divide(5L * mN);
  }
}

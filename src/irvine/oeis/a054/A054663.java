package irvine.oeis.a054;

import irvine.math.IntegerUtils;
import irvine.math.Mobius;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054663 Number of monic irreducible polynomials over GF(5) with zero trace.
 * @author Sean A. Irvine
 */
public class A054663 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.FIVE.pow(mN / d).multiply(IntegerUtils.gcd(d, 5)).multiply(Mobius.mobius(d))).divide(5L * mN);
  }
}

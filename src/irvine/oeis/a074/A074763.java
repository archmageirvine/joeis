package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074763 a(n) = (1/n) * Sum_{d divides n} (-1)^(n+d)*phi(n/d)*2^d.
 * @author Sean A. Irvine
 */
public class A074763 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.NEG_ONE.pow(mN + d).multiply(Functions.PHI.l(mN / d)).shiftLeft(d)).divide(mN);
  }
}

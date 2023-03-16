package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061860 Variant of A061417.
 * @author Sean A. Irvine
 */
public class A061860 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Binomial.binomial(mN, d).multiply(Euler.phiAsLong(mN / d)).multiply(MemoryFactorial.SINGLETON.factorial(d))).divide(mN);
  }
}

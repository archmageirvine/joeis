package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066398.
 * @author Sean A. Irvine
 */
public class A066399 extends Sequence0 {

  private int mN = -2;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN + 1);
    return Z.NEG_ONE.pow(mN).multiply(Integers.SINGLETON.sum(0, mN, k -> n.pow(k).multiply(MemoryFactorial.SINGLETON.factorial(mN)).multiply(Binomial.binomial(2L * mN - k, mN)).divide(MemoryFactorial.SINGLETON.factorial(k))));
  }
}

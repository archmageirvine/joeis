package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Integers;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059203 Number of n-block T_0-covers of a labeled set.
 * @author Sean A. Irvine
 */
public class A059203 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(2, mN + 1,
      k -> Stirling.firstKind(mN + 1, k).multiply(CR.E.multiply(MemoryFactorial.SINGLETON.factorial((1 << (k - 1)) - 1)).floor()))
      .divide(MemoryFactorial.SINGLETON.factorial(mN))
      .add((mN & 1) == 0 ? 1 : -1);
  }
}

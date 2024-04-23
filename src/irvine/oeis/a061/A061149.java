package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061149 Smallest number whose number of divisors = n-th primorial (A002110).
 * @author Sean A. Irvine
 */
public class A061149 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN, k -> Functions.PRIME.z(k).pow(Functions.PRIME.l(mN - k + 1) - 1));
  }
}

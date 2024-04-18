package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Fibonacci;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065490 Exponents in expansion of constant A065463 as Product_{n&gt;1} zeta(n)^(-a(n)).
 * @author Sean A. Irvine
 */
public class A065490 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Z.NEG_ONE.pow(d).multiply(Functions.MOBIUS.i((long) (mN / d))).multiply(Fibonacci.fibonacci(d - 1).add(Fibonacci.fibonacci(d + 1)).subtract(1))).divide(mN);
  }
}

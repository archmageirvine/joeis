package irvine.oeis.a060;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A060516 Number of series-reduced (or homeomorphically irreducible) graphs with loops on n labeled nodes.
 * @author Sean A. Irvine
 */
public class A060516 extends A060517 {

  private int mN = -1;

  @Override
  public Z next() {
    return INNER.eval(t(++mN).coeff(mN), Q.ONE).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}

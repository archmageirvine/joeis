package irvine.oeis.a055;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A055740 Sum of fourth powers of coefficients in full expansion of (z1+z2+...+zn)^n.
 * @author Sean A. Irvine
 */
public class A055740 extends MemoryFunction2Sequence<Integer, Q> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Q.ONE;
    }
    if (m < 1) {
      return Q.ZERO;
    }
    return Rationals.SINGLETON.sum(0, n, k -> get(n - k, m - 1).multiply(Binomial.binomial(n, k).pow(3)).divide(MemoryFactorial.SINGLETON.factorial(k)));
  }

  @Override
  public Z next() {
    return get(++mN, mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}

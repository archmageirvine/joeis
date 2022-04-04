package irvine.oeis.a033;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033935 Sum of squares of coefficients in full expansion of (z1+z2+...+zn)^n.
 * @author Sean A. Irvine
 */
public class A033935 extends MemoryFunction2<Integer, Q> implements Sequence {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Q.ONE;
    }
    if (m < 1) {
      return Q.ZERO;
    }
    Q sum = Q.ZERO;
    for (int j = 0; j <= n; ++j) {
      sum = sum.add(get(n - j, m - 1).multiply(Binomial.binomial(n, j)).divide(mF.factorial(j)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN).multiply(mF.factorial(mN)).toZ();
  }
}

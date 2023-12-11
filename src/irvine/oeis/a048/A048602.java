package irvine.oeis.a048;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048602 Numerators of coefficients in function a(x) such that a(a(x)) = sin(x).
 * @author Sean A. Irvine
 */
public class A048602 extends MemoryFunction2Sequence<Integer, Q> {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  protected int mN = -1;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    if (((n + m) & 1) == 0) {
      for (int k = 0; k <= m / 2; ++k) {
        sum = sum.signedAdd((((n + m) / 2 - k) & 1) == 0, new Q(Binomial.binomial(m, k).multiply(Z.valueOf(2L * k - m).pow(n))));
      }
      sum = sum.divide(mF.factorial(n).shiftLeft(m));
      sum = sum.multiply(2);
    }
    for (int k = m + 1; k < n; ++k) {
      sum = sum.subtract(get(n, k).multiply(get(k, m)));
    }
    return sum.divide(2);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    mN += 2;
    return select(get(mN, 1));
  }
}


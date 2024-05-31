package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048605 Numerators of coefficients in function a(x) such that a(a(x)) = arctan(x).
 * @author Sean A. Irvine
 */
public class A048605 extends MemoryFunction2Sequence<Integer, Q> {

  private int mN = -1;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    final int a = ((3 * n + m) & 2) == 0 ? 1 : -1;
    final int b = ((n - m) & 2) == 0 ? 1 : -1;
    final int c = a + b;
    if (((n + m) & 1) == 0 && c != 0) {
      for (int k = m; k <= n; ++k) {
        sum = sum.add(new Q(Binomial.binomial(n - 1, k - 1).multiply(Functions.STIRLING1.z(k, (long) m)).shiftLeft(k), Functions.FACTORIAL.z(k)));
      }
      sum = sum.multiply(c).multiply(Functions.FACTORIAL.z(m));
      sum = sum.divide(Z.ONE.shiftLeft(m + 1));
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


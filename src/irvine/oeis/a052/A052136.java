package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052136 Numerators of power series coefficients of a(x) satisfying a(a(a(x)))= arctan(x).
 * @author Sean A. Irvine
 */
public class A052136 extends MemoryFunction2<Integer, Q> implements Sequence {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    if (((n - m) & 1) == 0) {
      Q s0 = Q.ZERO;
      for (int i = m; i <= n; ++i) {
        s0 = s0.add(new Q(Stirling.firstKind(i, m).multiply(Binomial.binomial(n - 1, i - 1)).shiftLeft(i), mF.factorial(i)));
      }
      final int v = (3 * n + m) / 2;
      sum = sum.signedAdd((v & 1) == 0, s0.multiply(mF.factorial(m)).divide(Z.ONE.shiftLeft(m)));
    }
    for (int k = m + 1; k < n; ++k) {
      Q s1 = Q.ZERO;
      for (int i = k; i <= n; ++i) {
        s1 = s1.add(get(n, i).multiply(get(i, k)));
      }
      sum = sum.subtract(s1.multiply(get(k, m)));
    }
    Q s2 = Q.ZERO;
    for (int i = m + 1; i < n; ++i) {
      s2 = s2.add(get(n, i).multiply(get(i, m)));
    }
    s2 = s2.multiply(get(m, m));
    sum = sum.subtract(s2);
    return sum.divide(3);
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(get(2 * ++mN - 1, 1));
  }
}


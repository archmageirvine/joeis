package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052132 Numerators of coefficients in function a(x) such that a(a(a(x))) = sin x.
 * @author Sean A. Irvine
 */
public class A052132 extends MemoryFunction2<Integer, Q> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = Q.ZERO;
    if (((n - m) & 1) == 0) {
      Z s0 = Z.ZERO;
      final int v = (n + m) / 2;
      for (int i = 0; i <= m / 2; ++i) {
        s0 = s0.signedAdd(((v - i) & 1) == 0, Binomial.binomial(m, i).multiply(Z.valueOf(2L * i - m).pow(n)));
      }
      sum = sum.add(new Q(s0.multiply2(), mF.factorial(n).shiftLeft(m)));
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


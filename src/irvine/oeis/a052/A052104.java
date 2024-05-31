package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A052104 Numerators of coefficients of the formal power series a(x) such that a(a(x)) = exp(x) - 1.
 * @author Sean A. Irvine
 */
public class A052104 extends MemoryFunction2Sequence<Integer, Q> {

  // After Alois P. Heinz

  protected int mN = -1;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = new Q(Functions.FACTORIAL.z(m), Functions.FACTORIAL.z(n)).multiply(Functions.STIRLING2.z((long) n, (long) m));
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
    return select(get(++mN, 1));
  }
}

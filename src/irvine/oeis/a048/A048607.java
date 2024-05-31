package irvine.oeis.a048;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A048607 Numerators of coefficients in function a(x) such that a(a(x)) = log(1+x).
 * @author Sean A. Irvine
 */
public class A048607 extends MemoryFunction2Sequence<Integer, Q> {

  private int mN = 0;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = new Q(Functions.STIRLING1.z((long) n, (long) m).multiply(Functions.FACTORIAL.z(m)), Functions.FACTORIAL.z(n));
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


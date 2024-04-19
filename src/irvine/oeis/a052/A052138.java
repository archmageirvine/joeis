package irvine.oeis.a052;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A052138 Numerators of coefficients in function a(x) such that a(a(a(x))) = log (1+x).
 * @author Sean A. Irvine
 */
public class A052138 extends MemoryFunction2Sequence<Integer, Q> {

  /** Construct the sequence. */
  public A052138() {
    super(1);
  }

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  protected Q compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Q.ONE;
    }
    Q sum = new Q(Stirling.firstKind(n, m).multiply(Functions.FACTORIAL.z(m)), Functions.FACTORIAL.z(n));
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
    return select(get(++mN, 1));
  }
}


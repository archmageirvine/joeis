package irvine.oeis.a003;

import irvine.math.IntegerUtils;
import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A003122 Number of Hamiltonian rooted triangulations with n internal nodes and 3 external nodes.
 * @author Sean A. Irvine
 */
public class A003122 extends MemoryFunction2Sequence<Integer, Z> {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;
  private int mN = -1;

  private static Z p(final int n, final int k) {
    return FACTORIAL.factorial(2 * n + 2 * k - 4)
      .divide(FACTORIAL.factorial(n + k - 2))
      .multiply(FACTORIAL.factorial(2 * n + k - 1))
      .divide(FACTORIAL.factorial(n + k - 1))
      .multiply(k)
      .divide(FACTORIAL.factorial(n))
      .divide(FACTORIAL.factorial(n + k));
  }

  private static class RFunction extends MemoryFunction1<Z> {
    @Override
    protected Z compute(final int n) {
      return Binomial.binomial(2L * n, n).divide(n + 1).square();
    }
  }

  private class AFunction extends MemoryFunction2<Integer, Z> {
    private Z b(final int s, final int m) {
      final IntegerPartition part = new IntegerPartition(s);
      Z b = Z.ZERO;
      int[] p;
      final int[] a = new int[s + 1];
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, a);
        if (IntegerUtils.sum(a) == m) {
          Z t = FACTORIAL.factorial(m);
          for (int k = 1; k < a.length; ++k) {
            final int mk = a[k];
            t = t.multiply(mR.get(k).pow(mk));
            if (mk > 1) {
              t = t.divide(FACTORIAL.factorial(mk));
            }
          }
          b = b.add(t);
        }
      }
      return b;
    }

    @Override
    protected Z compute(final Integer p, final Integer q) {
      if (q == 0) {
        return Z.ONE;
      }
      if (q == 1) {
        return Z.valueOf(p);
      }
      Z a = Z.ZERO;
      for (int m = 1; m <= q; ++m) {
        a = a.add(Binomial.binomial(p, m).multiply(b(q, m)));
      }
      return a;
    }
  }

  private final MemoryFunction1<Z> mR = new RFunction();
  private final MemoryFunction2<Integer, Z> mA = new AFunction();

  @Override
  protected Z compute(final Integer n, final Integer k) {
    Z f = p(n, k);
    for (int s = 0; s < n; ++s) {
      f = f.subtract(get(s, k).multiply(mA.get(k + s, n - s)));
    }
    return f;
  }

  protected int k() {
    return 3;
  }

  @Override
  public Z next() {
    return get(++mN, k());
  }

}

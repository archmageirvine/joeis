package irvine.oeis.a035;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A035049 E.g.f. satisfies A(x) = x*(1+A(A(x))), A(0)=0.
 * @author Sean A. Irvine
 */
public class A035049 extends MemorySequence {

  // After Alois P. Heinz

  {
    setOffset(1);
    add(Z.ZERO); // a(0)=0 is not in OEIS
  }

  private final MemoryFunction2<Integer, Z> mF = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer m) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int j = 1; j <= n; ++j) {
        sum = sum.add(a(j).multiply(m).multiply(get(n - j, m - 1)).multiply(Binomial.binomial(n - 1, j - 1)));
      }
      return sum;
    }
  };

  @Override
  protected Z computeNext() {
    return mF.get(size() - 1, size());
  }
}

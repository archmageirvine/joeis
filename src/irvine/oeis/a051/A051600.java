package irvine.oeis.a051;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A051600 Rows of triangle formed using Pascal's rule except begin n-th row with (n+1)st prime and end it with (n+2)nd prime.
 * @author Sean A. Irvine
 */
public class A051600 extends MemoryFunction2Sequence<Integer, Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m < 0 || m > n) {
      return Z.ZERO;
    }
    if (m.equals(n)) {
      return Puma.primeZ(2L * mN + 1);
    }
    if (m == 0) {
      return Puma.primeZ(2L * mN);
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}


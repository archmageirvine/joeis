package irvine.oeis.a039;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A039757 Triangle of coefficients in expansion of (x-1)*(x-3)*(x-5)*...*(x-(2*n-1)).
 * @author Sean A. Irvine
 */
public class A039757 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m == 0) {
      final Z df = mF.doubleFactorial(2 * n - 1);
      return (n & 1) == 0 ? df : df.negate();
    }
    return get(n - 1, m - 1).subtract(get(n - 1, m).multiply(2 * n - 1));
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


package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;

/**
 * A008955 Triangle of central factorial numbers |t(2n,2n-2k)| read by rows.
 * @author Sean A. Irvine
 */
public class A008955 extends MemoryFunction2Sequence<Integer, Z> {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return Z.ONE;
    }
    if (k.equals(n)) {
      return mF.factorial(n).square();
    }
    return get(n - 1, k - 1).multiply(n * (long) n).add(get(n - 1, k));
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


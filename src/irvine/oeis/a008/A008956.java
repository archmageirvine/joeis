package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008956.
 * @author Sean A. Irvine
 */
public class A008956 extends MemoryFunction2<Integer, Z> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return Z.ONE;
    }
    if (k.equals(n)) {
      return mF.doubleFactorial(2 * n - 1).square();
    }
    return get(n - 1, k - 1).multiply(2L * n - 1).multiply(2L * n - 1).add(get(n - 1, k));
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

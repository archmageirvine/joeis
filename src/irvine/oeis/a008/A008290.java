package irvine.oeis.a008;

import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A008290 Triangle T(n,k) of rencontres numbers (number of permutations of n elements with k fixed points).
 * @author Sean A. Irvine
 */
public class A008290 extends MemoryFunction2Sequence<Long, Z> {

  // After Alois P. Heinz

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (k == 0) {
      return n < 2 ? Z.ONE.subtract(n) : get(n - 1, 0L).add(get(n - 2, 0L)).multiply(n - 1);
    } else {
      return get(n - k, 0L).multiply(Binomial.binomial(n, k));
    }
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

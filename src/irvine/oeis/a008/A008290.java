package irvine.oeis.a008;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008290.
 * @author Sean A. Irvine
 */
public class A008290 extends MemoryFunction2<Long, Z> implements Sequence {

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

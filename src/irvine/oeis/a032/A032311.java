package irvine.oeis.a032;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032311.
 * @author Sean A. Irvine
 */
public class A032311 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 2) {
      return Z.ZERO;
    }
    final Z b = get(n, m - 1);
    return m > n ? b : b.add(Binomial.binomial(n, m));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}

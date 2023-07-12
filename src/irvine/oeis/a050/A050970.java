package irvine.oeis.a050;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A050970 Numerator of S(n)/Pi^n, where S(n) = Sum_{k=-inf..+inf} (4k+1)^(-n).
 * @author Sean A. Irvine
 */
public class A050970 extends MemoryFunction2Sequence<Long, Z> {

  /** Construct the sequence. */
  public A050970() {
    super(1);
  }

  private long mN = -1;
  private Z mF = Z.ONE;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      return n == 0 ? Z.ONE : Z.ZERO;
    }
    return get(n, m - 1).add(get(n - 1, n - m));
  }

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN >= 1) {
      mF = mF.multiply(2 * mN);
    }
    return select(new Q(get(mN, mN), mF));
  }
}

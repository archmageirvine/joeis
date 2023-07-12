package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A032434 Triangle read by rows: last survivors of Josephus elimination process.
 * @author Sean A. Irvine
 */
public class A032434 extends MemoryFunction2Sequence<Long, Long> {

  /** Construct the sequence. */
  public A032434() {
    super(1);
  }

  private long mN = 0;
  private long mM = 0;

  @Override
  protected Long compute(final Long n, final Long m) {
    if (n == 1) {
      return 1L;
    }
    final long r = (get(n - 1, m) + m) % n;
    return r == 0 ? n : r;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(get(mN, mM));
  }

}

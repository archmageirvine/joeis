package irvine.oeis.a046;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A046214 First denominator and then numerator of 1/2-Pascal triangle (by row).
 * @author Sean A. Irvine
 */
public class A046214 extends MemoryFunction2Sequence<Long, Q> {

  /** Construct the sequence. */
  public A046214() {
    super(1);
  }

  private boolean mNumerator = true;
  private long mN = -1;
  private long mM = 0;

  @Override
  protected Q compute(final Long n, final Long m) {
    if (m < 0 || m > n) {
      return Q.ZERO;
    }
    if (n < 2) {
      return Q.ONE;
    }
    if (n == 2) {
      return m == 1 ? Q.HALF : Q.ONE;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
  }

  @Override
  public Z next() {
    mNumerator = !mNumerator;
    if (!mNumerator && ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mNumerator ? get(mN, mM).num() : get(mN, mM).den();
  }
}

package irvine.oeis.a046;

import irvine.math.MemoryFunction2;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046213 First numerator and then denominator of 1/2-Pascal triangle (by row). To get a 1/2-Pascal triangle, replace "2" in third row of Pascal triangle with "1/2" and calculate all other rows as in Pascal triangle.
 * @author Sean A. Irvine
 */
public class A046213 extends MemoryFunction2<Long, Q> implements Sequence {

  private boolean mNumerator = false;
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
    if (mNumerator && ++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mNumerator ? get(mN, mM).num() : get(mN, mM).den();
  }
}

package irvine.oeis.a035;

import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035312 Zorach additive triangle, read by rows.
 * @author Sean A. Irvine
 */
public class A035312 extends MemoryFunction2<Long, Z> implements Sequence {

  private final Set<Z> mUsed = new HashSet<>();
  private Z mUnused = Z.ONE;
  private long mN = -1;
  private long mM = 0;

  private boolean isOkStarter(final Z start, final long n) {
    if (mUsed.contains(start)) {
      return false;
    }
    Z s = start;
    for (long m = 1; m <= n; ++m) {
      s = s.add(get(n - 1, m - 1));
      if (mUsed.contains(s)) {
        return false;
      }
    }
    return true;
  }

  // Care is needed calling the following.  Every value of m must be
  // called before the next value of n.  Note the code does not enforce
  // this, the caller must do so.
  @Override
  protected Z compute(final Long n, final Long m) {
    if (m == 0) {
      while (mUsed.contains(mUnused)) {
        mUnused = mUnused.add(1);
      }
      Z u = mUnused;
      if (n > 0) {
        while (!isOkStarter(u, n)) {
          // Using u would violate each number appears once, so find another u
          u = u.add(1);
        }
      }
      mUsed.add(u);
      return u;
    }
    final Z res = get(n, m - 1).add(get(n - 1, m - 1));
    mUsed.add(res);
    return res;
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

package irvine.oeis.a061;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061988 Find smallest k such that k^n is a sum of n n-th powers, say k^n = T(n,1)^n + ... + T(n,n)^n. Sequence gives triangle of successive rows T(n,1), ..., T(n,n). T(n,1) = ... = T(n,n) = 0 indicates no solution exists.
 * @author Sean A. Irvine
 */
public class A061988 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final ArrayList<Z> mPowers = new ArrayList<>();
  private final ArrayList<Z> mA = new ArrayList<>();

  private boolean isPowerExpressible(final Z n, final int cnt, int next) {
    if (cnt == 0) {
      return n.isZero();
    }
    while (next < mPowers.size() && mPowers.get(next).compareTo(n) <= 0) {
      final Z s = mPowers.get(next);
      mA.add(s);
      if (isPowerExpressible(n.subtract(s), cnt - 1, next + 1)) {
        return true;
      }
      mA.remove(s);
      ++next;
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mM >= mA.size()) {
      ++mN;
      mA.clear();
      mPowers.clear();
      mPowers.add(null);
      Z m = Z.ZERO;
      while (true) {
        m = m.add(1);
        final Z t = m.pow(mN);
        mPowers.add(t);
        if (isPowerExpressible(t, mN, 1)) {
          break;
        }
      }
      mM = 0;
    }
    return mA.get(mM).root(mN);
  }
}

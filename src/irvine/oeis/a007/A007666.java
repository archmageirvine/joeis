package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007666 <code>a(n) =</code> smallest number k such that <code>k^n</code> is the sum of n positive n-th powers, or 0 if no solution exists.
 * @author Sean A. Irvine
 */
public class A007666 implements Sequence {

  // This will eventually get a(4) and then a(5), but is no good for finding a(6) (if it exists)

  private int mN = 0;
  private final ArrayList<Z> mPowers = new ArrayList<>();

  private boolean isPowerExpressible(final Z n, final int cnt, int next) {
    if (cnt == 0) {
      return Z.ZERO.equals(n);
    }
    while (next < mPowers.size() && mPowers.get(next).compareTo(n) <= 0) {
      if (isPowerExpressible(n.subtract(mPowers.get(next)), cnt - 1, next + 1)) {
        return true;
      }
      ++next;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    mPowers.clear();
    mPowers.add(null);
    Z m = Z.ZERO;
    while (true) {
      m = m.add(1);
      //System.out.println("Trying: " + m);
      final Z t = m.pow(mN);
      mPowers.add(t);
      if (isPowerExpressible(t, mN, 1)) {
        return m;
      }
    }
  }

}

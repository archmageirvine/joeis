package irvine.oeis.a058;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;

/**
 * A058817 Even cototient numbers.
 * @author Sean A. Irvine
 */
public class A058817 extends A051953 {

  private static final int HEURISTIC = 5;
  private final HashSet<Z> mDone = new HashSet<>();
  private final TreeSet<Z> mNext = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 0;
  {
    super.next(); // skip 0
  }

  @Override
  public Z next() {
    ++mN;
    while (mNext.size() < HEURISTIC * mN) {
      final Z t = super.next();
      if (t.isEven() && mDone.add(t)) {
        mNext.add(t);
      }
    }
    final Z res = mNext.pollFirst();
    if (res.compareTo(mPrev) < 0) {
      throw new UnsupportedOperationException("Heuristic failed: " + res + " should have been output earlier");
    }
    mPrev = res;
    return res;
  }
}

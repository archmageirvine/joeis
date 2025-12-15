package irvine.oeis.a082;

import java.util.HashSet;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a077.A077389;

/**
 * A082592 A077389 sorted and duplicates removed.
 * @author Sean A. Irvine
 */
public class A082592 extends A077389 implements Conjectural {

  private static final int HEURISTIC = 2;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final HashSet<Z> mReported = new HashSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 1;

  @Override
  public Z next() {
    while (mA.size() < HEURISTIC * mN) {
      final Z t = super.next();
      if (t.compareTo(mPrev) < 0 && mReported.add(t)) {
        throw new RuntimeException("Heuristic failed");
      }
      mA.add(t);
    }
    ++mN;
    final Z res = mA.pollFirst();
    mReported.add(res);
    mPrev = res;
    return res;
  }
}

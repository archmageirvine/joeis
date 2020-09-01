package irvine.oeis.a034;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a002.A002033;

/**
 * A034776 Gozinta numbers: possible number of gozinta chains for some positive integer.
 * @author Sean A. Irvine
 */
public class A034776 extends A002033 {

  // There must be a better way of doing this sequence ...

  private static final int HEURISTIC_SIZE = 3;
  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mDone = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.size() < HEURISTIC_SIZE * mN) {
      final Z t = super.next();
      if (t.compareTo(mPrev) > 0) {
        mA.add(t);
      } else if (!mDone.contains(t)) {
        throw new RuntimeException("Heuristic violated, found " + t + " not previously output");
      }
    }
    final Z r = mA.pollFirst();
    mPrev = r;
    mDone.add(r);
    return r;
  }
}

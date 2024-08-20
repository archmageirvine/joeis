package irvine.oeis.a071;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a067.A067434;

/**
 * A071853 Numbers n such that for any x, C(2x,x) never has n distinct prime factors.
 * @author Sean A. Irvine
 */
public class A071853 extends A067434 implements Conjectural {

  private static final long HEURISTIC = 10;
  private Z mN = Z.ONE;
  private final TreeSet<Z> mSeen = new TreeSet<>();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mSeen.isEmpty() || mSeen.last().compareTo(mN.add(HEURISTIC)) <= 0) {
        mSeen.add(super.next());
      }
      if (!mSeen.contains(mN)) {
        return mN;
      }
    }
  }
}

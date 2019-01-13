package irvine.oeis.a002;

import irvine.math.z.Z;

import java.util.HashSet;

/**
 * A002174.
 * @author Sean A. Irvine
 */
public class A002174 extends A002322 {

  private Z mN = Z.ZERO;
  private final HashSet<Z> mSeen = new HashSet<>(1000000);

  @Override
  public Z next() {
    // This is heuristic -- I'm not certain how far ahead a search
    // should be, it does detect when it has failed
    while (true) {
      mN = mN.add(1);
      // Heuristic process as many terms as mN
      for (Z k = Z.ZERO; k.compareTo(mN) < 0; k = k.add(1)) {
        final Z t = super.next();
        if (mSeen.add(t) && t.compareTo(mN) < 0) {
          // Heuristic failed
          throw new RuntimeException();
        }
      }
      if (mSeen.contains(mN)) {
        return mN;
      }
    }
  }
}

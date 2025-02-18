package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075327 Sum of n-th pair in A075325.
 * @author Sean A. Irvine
 */
public class A075327 extends Sequence1 {

  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mSeen.add(mN)) {
        Z k = mN;
        while (true) {
          k = k.add(1);
          if (!mSeen.contains(k)) {
            final Z diff = k.subtract(mN);
            if (mSeen.add(diff)) {
              mSeen.add(k);
              return mN.add(k);
            }
          }
        }
      }
    }
  }
}

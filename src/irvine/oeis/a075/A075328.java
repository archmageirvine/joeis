package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075328 Difference between n-th pair in A075325.
 * @author Sean A. Irvine
 */
public class A075328 extends Sequence0 {

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
              return diff;
            }
          }
        }
      }
    }
  }
}

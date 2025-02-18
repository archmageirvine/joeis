package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075329 Pair up the natural numbers as (r, s) (say) so that all natural numbers are obtained only once as r, s, s+r or s-r: (1, 3), (5, 11), (7, 15), (9, 19), (12, 25), (14, 31), (18, 38), ... Sequence gives first member of each pair.
 * @author Sean A. Irvine
 */
public class A075329 extends Sequence1 {

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
            if (!mSeen.contains(diff)) {
              final Z add = k.add(mN);
              if (mSeen.add(add)) {
                mSeen.add(k);
                mSeen.add(diff);
                return mN;
              }
            }
          }
        }
      }
    }
  }
}

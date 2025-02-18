package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075333 Pair up the natural numbers as (r, s) (say) so that all natural numbers are obtained only once as r, s, s+r, s-r or r*s: (2, 3), (4, 11), (8, 17), (10, 22), (13, 27), (16, 34), ... Sequence gives first member of each pair.
 * @author Sean A. Irvine
 */
public class A075333 extends Sequence1 {

  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ONE;

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
              if (!mSeen.contains(add)) {
                final Z mul = k.multiply(mN);
                if (mSeen.add(mul)) {
                  mSeen.add(k);
                  mSeen.add(diff);
                  mSeen.add(add);
                  return mN;
                }
              }
            }
          }
        }
      }
    }
  }
}

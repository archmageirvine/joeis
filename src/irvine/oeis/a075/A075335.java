package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075335 Differences of members of pairs in A075333.
 * @author Sean A. Irvine
 */
public class A075335 extends Sequence1 {

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
                  return diff;
                }
              }
            }
          }
        }
      }
    }
  }
}

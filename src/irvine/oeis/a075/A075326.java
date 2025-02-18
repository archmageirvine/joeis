package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A075326 Anti-Fibonacci numbers: start with a(0) = 0, and extend by the rule that the next term is the sum of the two smallest numbers that are not in the sequence nor were used to form an earlier sum.
 * @author Sean A. Irvine
 */
public class A075326 extends Sequence0 {

  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = null;

  @Override
  public Z next() {
    if (mN == null) {
      mN = Z.ZERO;
      return Z.ZERO;
    }
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
              return k;
            }
          }
        }
      }
    }
  }
}

package irvine.oeis.a038;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038688 Squares which are the sum of the divisors of some n.
 * @author Sean A. Irvine
 */
public class A038688 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final TreeSet<Z> mSeen = new TreeSet<>();
  private Z mPrev = Z.ZERO;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().multiply2().compareTo(mN) >= 0) {
      mN = mN.add(1);
      final Z sigma = Functions.SIGMA.z(mN);
      if (sigma.isSquare()) {
        if (sigma.compareTo(mPrev) < 0 && mSeen.add(sigma)) {
          throw new RuntimeException("Heuristic failed: " + sigma + " should have been output earlier");
        }
        mA.add(sigma);
      }
    }
    mPrev = mA.pollFirst();
    mSeen.add(mPrev);
    return mPrev;
  }
}

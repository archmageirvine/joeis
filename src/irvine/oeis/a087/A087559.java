package irvine.oeis.a087;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087559 Rearrangement of natural numbers such that n*a(n) + 1 is a prime.
 * @author Sean A. Irvine
 */
public class A087559 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mN = 0;
  private long mLeastUnused = 1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (!mUsed.contains(k) && n.multiply(k).add(1).isProbablePrime()) {
        mUsed.add(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

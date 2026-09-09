package irvine.oeis.a086;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086517 a(1) = 1 and then the smallest odd number not included earlier such that the arithmetic mean of a pair of successive terms is prime.
 * @author Sean A. Irvine
 */
public class A086517 extends Sequence1 {

  private final HashSet<Long> mUsed = new HashSet<>();
  private long mLeastUnused = 3;
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      mLeastUnused += 2;
    }
    long k = mLeastUnused;
    while (mUsed.contains(k) || !mA.add(k).divide2().isProbablePrime()) {
      k += 2;
    }
    mUsed.add(k);
    mA = Z.valueOf(k);
    return mA;
  }
}


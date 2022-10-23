package irvine.oeis.a018;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A018900 Sums of two distinct powers of 2.
 * @author Sean A. Irvine
 */
public class A018900 extends Sequence1 {

  private final TreeSet<Z> mCache = new TreeSet<>();
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    while (mCache.isEmpty() || mCache.first().compareTo(mA) > 0) {
      mA = mA.multiply2();
      for (Z b = Z.ONE; b.compareTo(mA) < 0; b = b.multiply2()) {
        mCache.add(mA.add(b));
      }
    }
    return mCache.pollFirst();
  }
}

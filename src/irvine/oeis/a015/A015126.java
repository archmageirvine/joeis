package irvine.oeis.a015;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015126 Least k such that phi(k) = phi(n).
 * @author Sean A. Irvine
 */
public class A015126 extends Sequence1 {

  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long phi = Euler.phiAsLong(++mN);
    if (mLeast.get(phi) == 0) {
      mLeast.set(phi, mN);
    }
    return Z.valueOf(mLeast.get(phi));
  }
}

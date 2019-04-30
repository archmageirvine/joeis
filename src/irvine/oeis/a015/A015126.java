package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicLongArray;

/**
 * A015126 Least k such that <code>phi(k) = phi(n)</code>.
 * @author Sean A. Irvine
 */
public class A015126 implements Sequence {

  private final LongDynamicLongArray mLeast = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    final long phi = LongUtils.phi(++mN);
    if (mLeast.get(phi) == 0) {
      mLeast.set(phi, mN);
    }
    return Z.valueOf(mLeast.get(phi));
  }
}

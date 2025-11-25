package irvine.oeis.a390;

import java.util.HashMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A390513 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390513 extends Sequence1 {

  private final Sequence mS = new A390512();
  private final HashMap<Long, Long> mInverse = new HashMap<>();
  private long mR = 0;
  private int mN = 0;
  private int mM = -1;

  private Z inv(final long n) {
    while (!mInverse.containsKey(n)) {
      mInverse.put(mS.next().longValueExact(), ++mR);
    }
    return Z.valueOf(mInverse.get(n));
  }


  private Z u(final int n, final int m) {
    if (m == 0) {
      return inv(n);
    }
    return inv(-(n + (1L << (m + LongUtils.log2(n))) - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return u(mM, mN - mM);
  }
}

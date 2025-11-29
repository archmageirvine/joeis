package irvine.oeis.a390;

import java.util.HashMap;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A390513 Rectangular array, (U(n,k)), read by descending antidiagonals. Let S be the sequence of all 01 words in lexicographic order. Then U(n,k) is the position in A390512 of the index of the word 0^(k-1)w(n), where w(n) is the n-th word in S that is 0 or has first letter 1.
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

package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063067 Numbers expressible as (a^2-1)(b^2-1) in at least 2 distinct ways (b&gt;=a&gt;1).
 * @author Sean A. Irvine
 */
public class A063067 extends Sequence1 {

  private final TreeSet<Z> mProducts = new TreeSet<>();
  private final TreeSet<Z> mTwice = new TreeSet<>();
  private long mN = 2;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      while (mProducts.isEmpty() || mS.compareTo(mProducts.first()) <= 0) {
        for (long k = 2; k <= mN; ++k) {
          final Z t = mS.multiply(Z.valueOf(k).square().subtract(1));
          if (!mProducts.add(t)) {
            mTwice.add(t);
          }
        }
        mS = Z.valueOf(++mN).square().subtract(1);
      }
      final Z x = mProducts.pollFirst();
      if (!mTwice.isEmpty() && x.equals(mTwice.first())) {
        return mTwice.pollFirst();
      }
    }
  }
}

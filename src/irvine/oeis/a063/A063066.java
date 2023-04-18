package irvine.oeis.a063;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063066 Numbers expressible as (a^2-1)(b^2-1).
 * @author Sean A. Irvine
 */
public class A063066 extends Sequence1 {

  private final TreeSet<Z> mProducts = new TreeSet<>();
  private long mN = 2;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    while (mProducts.isEmpty() || mS.compareTo(mProducts.first()) <= 0) {
      for (long k = 2; k <= mN; ++k) {
        mProducts.add(mS.multiply(Z.valueOf(k).square().subtract(1)));
      }
      mS = Z.valueOf(++mN).square().subtract(1);
    }
    return mProducts.pollFirst();
  }
}

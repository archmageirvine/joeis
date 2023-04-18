package irvine.oeis.a063;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063068 Smallest number expressible as (a^2-1)(b^2-1) in at least n distinct ways [with b&gt;=a&gt;1].
 * @author Sean A. Irvine
 */
public class A063068 extends Sequence1 {

  private final TreeMap<Z, Integer> mProducts = new TreeMap<>();
  private int mN = 0;
  private long mM = 2;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      while (mProducts.isEmpty() || mS.compareTo(mProducts.firstKey()) <= 0) {
        for (long k = 2; k <= mM; ++k) {
          final Z t = mS.multiply(Z.valueOf(k).square().subtract(1));
          mProducts.merge(t, 1, Integer::sum);
        }
        mS = Z.valueOf(++mM).square().subtract(1);
      }
      final Map.Entry<Z, Integer> e = mProducts.pollFirstEntry();
      if (e.getValue() == mN) {
        return e.getKey();
      }
    }
  }
}

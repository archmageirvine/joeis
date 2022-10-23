package irvine.oeis.a024;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A024751 Binomial coefficients: C(n,k), 7 &lt;= k &lt;= n-7, sorted.
 * @author Sean A. Irvine
 */
public class A024751 extends Sequence1 {

  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private Z mB = Z.valueOf(3432);
  private int mCount = 1;
  private long mM = 14;

  @Override
  public Z next() {
    if (mCount > 0) {
      --mCount;
      return mB;
    }
    if (mM <= mB.longValueExact()) {
      ++mM;
      for (long k = 7; k < mM - 6; ++k) {
        final Z v = Binomial.binomial(mM, k);
        final Integer c = mA.get(v);
        mA.put(v, c == null ? 1 : c + 1);
      }
    }
    final Map.Entry<Z, Integer> e = mA.pollFirstEntry();
    mCount = e.getValue() - 1;
    mB = e.getKey();
    return mB;
  }
}

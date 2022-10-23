package irvine.oeis.a010;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A010329 Expressible as C(m,3) + C(n,3) in at least 3 ways.
 * @author Sean A. Irvine
 */
public class A010329 extends Sequence1 {

  private long mN = 3;
  private final TreeMap<Z, Integer> mCount = new TreeMap<>();

  @Override
  public Z next() {
    Z currentBinomial = Binomial.binomial(mN, 3);
    while (true) {
      while (mCount.isEmpty() || mCount.firstKey().compareTo(currentBinomial) > 0) {
        for (long m = 3; m <= mN; ++m) {
          final Z sum = currentBinomial.add(Binomial.binomial(m, 3));
          final Integer cnt = mCount.get(sum);
          mCount.put(sum, 1 + (cnt == null ? (byte) 0 : cnt));
        }
        currentBinomial = Binomial.binomial(++mN, 3);
      }
      final Map.Entry<Z, Integer> e = mCount.pollFirstEntry();
      if (e.getValue() > 2) {
        return e.getKey();
      }
    }
  }
}

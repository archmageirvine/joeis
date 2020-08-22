package irvine.oeis.a010;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010331 Numbers that are expressible as C(m,5) + C(n,5) in at least 2 ways.
 * @author Sean A. Irvine
 */
public class A010331 implements Sequence {

  private long mN = 5;
  private final TreeMap<Z, Integer> mCount = new TreeMap<>();

  @Override
  public Z next() {
    Z currentBinomial = Binomial.binomial(mN, 5);
    while (true) {
      while (mCount.isEmpty() || mCount.firstKey().compareTo(currentBinomial) >= 0) {
        for (long m = 4; m <= mN; ++m) {
          final Z sum = currentBinomial.add(Binomial.binomial(m, 5));
          final Integer cnt = mCount.get(sum);
          mCount.put(sum, 1 + (cnt == null ? (byte) 0 : cnt));
        }
        currentBinomial = Binomial.binomial(++mN, 5);
      }
      final Map.Entry<Z, Integer> e = mCount.pollFirstEntry();
      if (e.getValue() > 1) {
        return e.getKey();
      }
    }
  }
}

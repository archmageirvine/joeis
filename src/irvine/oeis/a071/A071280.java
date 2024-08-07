package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A071280 Numbers which are nontrivial multiples of 3 palindromes (need not be distinct).
 * @author Sean A. Irvine
 */
public class A071280 extends Sequence1 {

  private final DirectSequence mPalindromes = DirectSequence.create(new A002113().skip(2)); // ignore 0 and 1
  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private int mN = 0;

  @Override
  public Z next() {
    while (mA.isEmpty() || mPalindromes.a(mN).multiply(4).compareTo(mA.firstKey()) <= 0) {
      for (int k = 0; k <= mN; ++k) {
        final Z t = mPalindromes.a(mN).multiply(mPalindromes.a(k));
        for (int j = 0; j <= k; ++j) {
          mA.merge(t.multiply(mPalindromes.a(j)), 1, Integer::sum);
        }
      }
      ++mN;
    }
    final Map.Entry<Z, Integer> e = mA.firstEntry();
    if (e.getValue() == 1) {
      mA.remove(e.getKey());
    } else {
      mA.put(e.getKey(), e.getValue() - 1);
    }
    return e.getKey();
  }
}

package irvine.oeis.a071;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;

/**
 * A071261.
 * @author Sean A. Irvine
 */
public class A071278 extends Sequence1 {

  private final DirectSequence mPalindromes = DirectSequence.create(new A002113().skip(2)); // ignore 0 and 1
  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private int mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mPalindromes.a(mN).multiply2().compareTo(mA.firstKey()) <= 0) {
      for (int k = 0; k < mN; ++k) {
        mA.merge(mPalindromes.a(mN).multiply(mPalindromes.a(k)), 1, Integer::sum);
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

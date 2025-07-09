package irvine.oeis.a078;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078643 Numbers with exactly one representation as the sum of two Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A078643 extends Sequence1 {

  private final TreeMap<Z, Long> mCounts = new TreeMap<>();
  private int mM = 2;

  @Override
  public Z next() {
    while (true) {
      while (mCounts.isEmpty() || mCounts.firstKey().compareTo(Functions.FIBONACCI.z(mM)) > 0) {
        final Z f = Functions.FIBONACCI.z(mM);
        for (int k = 2; k <= mM; ++k) {
          mCounts.merge(f.add(Functions.FIBONACCI.z(k)), 1L, Long::sum);
        }
        ++mM;
      }
      final Map.Entry<Z, Long> e = mCounts.pollFirstEntry();
      if (e.getValue() == 1) {
        return e.getKey();
      }
    }
  }
}

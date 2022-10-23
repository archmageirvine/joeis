package irvine.oeis.a052;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052217 Numbers whose sum of digits is 3.
 * @author Sean A. Irvine
 */
public class A052217 extends Sequence1 {

  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  {
    for (int k = 1; k <= target(); ++k) {
      mA.put(Z.valueOf(k), k);
    }
  }

  protected int target() {
    return 3;
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Integer> e = mA.pollFirstEntry();
      final int digitSum = e.getValue();
      final Z t = e.getKey().multiply(10);
      for (int k = 0; k + digitSum <= target(); ++k) {
        mA.put(t.add(k), k + digitSum);
      }
      if (digitSum == target()) {
        return e.getKey();
      }
    }
  }
}

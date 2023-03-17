package irvine.oeis.a068;

import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;

/**
 * A068127 Triangular numbers with sum of digits = 3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A068127 extends AbstractSequence {

  private final TreeMap<Z, Integer> mA = new TreeMap<>();
  private final int mSum;

  /** Construct the sequence. */
  public A068127() {
    this(1, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param sum required sum of digits
   */
  protected A068127(final int offset, final int sum) {
    super(offset);
    mSum = sum;
    for (int k = 1; k <= Math.min(mSum, 9); ++k) {
      mA.put(Z.valueOf(k), k);
    }
  }

  @Override
  public Z next() {
    while (true) {
      final Map.Entry<Z, Integer> e = mA.pollFirstEntry();
      final Z t = e.getKey();
      final int sum = e.getValue();
      final Z t10 = t.multiply(10);
      for (int k = 0; k <= Math.min(mSum - sum, 9); ++k) {
        mA.put(t10.add(k), sum + k);
      }
      if (sum == mSum && ZUtils.isTriangular(t)) {
        return t;
      }
    }
  }
}

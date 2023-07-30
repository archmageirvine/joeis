package irvine.oeis.a064;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064826 Numbers which are the sum of two pentagonal numbers (A000326) in exactly two different ways.
 * @author Sean A. Irvine
 */
public class A064826 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;
  private long mT = 1;
  private final TreeMap<Long, Integer> mA = new TreeMap<>();

  @Override
  public Z next() {
    while (true) {
      if (++mN >= mT - 1) {
        for (long k = 1; k <= mM; ++k) {
          mA.merge(mT + k * (3 * k - 1) / 2, 1, Integer::sum);
        }
        mT = ++mM * (3 * mM - 1) / 2;
      }
      final Integer v = mA.remove(mN);
      if (v != null && v == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}

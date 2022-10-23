package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059808 Numbers which contain the same digits in two different bases.
 * @author Sean A. Irvine
 */
public class A059808 extends Sequence1 {

  private int mN = 6;

  private String key(final int[] cnts) {
    final StringBuilder sb = new StringBuilder();
    int k = cnts.length - 1;
    while (cnts[k] == 0) {
      --k;
    }
    while (k >= 0) {
      sb.append(cnts[k]).append(',');
      --k;
    }
    return sb.toString();
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final HashSet<String> seen = new HashSet<>();
      for (int b = 2; b <= mN; ++b) {
        if (!seen.add(key(ZUtils.digitCounts(mN, b)))) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

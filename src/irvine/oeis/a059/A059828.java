package irvine.oeis.a059;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059828 Numbers which contain exactly the same digits (with the correct multiplicity) in 3 different smaller bases.
 * @author Sean A. Irvine
 */
public class A059828 implements Sequence {

  private int mN = 494;

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
      final HashSet<String> seen2 = new HashSet<>();
      for (int b = 2; b * b <= mN; ++b) {
        final String key = key(ZUtils.digitCounts(mN, b));
        if (!seen.add(key) && !seen2.add(key)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

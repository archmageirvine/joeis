package irvine.oeis.a045;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045611 Number of different energy states of n positive and n negative charges on a necklace. Different sets of distances between n points chosen from 2n equally spaced points on a circle.
 * @author Sean A. Irvine
 */
public class A045611 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 2) {
      return Z.ONE;
    }
    final HashSet<String> distances = new HashSet<>();
    final int charges = 2 * mN;
    final long limit = 1L << (charges - 1); // -1 for symmetry
    for (long state = (1L << mN) - 1; state < limit; state = LongUtils.swizzle(state)) {
      final int[] cnts = new int[mN];
      for (int k = 0; k < charges; ++k) {
        if (((state >>> k) & 1) != 0) {
          for (int j = k + 1; j < charges; ++j) {
            if (((state >>> j) & 1) != 0) {
              final int delta = Math.abs(k - j);
              final int shortest = Math.min(delta, charges - delta);
              ++cnts[shortest - 1];
            }
          }
        }
      }
      distances.add(Arrays.toString(cnts));
    }
    return Z.valueOf(distances.size());
  }
}

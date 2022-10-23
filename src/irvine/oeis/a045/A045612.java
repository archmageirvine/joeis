package irvine.oeis.a045;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045612 Number of different energy states between two stacked necklaces, each of n positive and n negative charges.
 * @author Sean A. Irvine
 */
public class A045612 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    final HashSet<String> distances = new HashSet<>();
    final int charges = 2 * mN;
    final long limit = 1L << charges;
    for (long state1 = (1L << mN) - 1; state1 < limit; state1 = LongUtils.swizzle(state1)) {
      for (long state2 = (1L << mN) - 1; state2 <= state1; state2 = LongUtils.swizzle(state2)) {
        final int[] cnts = new int[mN + 1];
        for (int k = 0; k < charges; ++k) {
          if (((state1 >>> k) & 1) != 0) {
            for (int j = 0; j < charges; ++j) {
              if (((state2 >>> j) & 1) != 0) {
                final int delta = Math.abs(k - j);
                final int shortest = Math.min(delta, charges - delta);
                ++cnts[shortest];
              }
            }
          }
        }
        distances.add(Arrays.toString(cnts));
      }
    }
    //System.out.println(distances);
    return Z.valueOf(distances.size());
  }
}

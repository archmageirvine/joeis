package irvine.oeis.a078;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078823 Sum of distinct binary numbers contained as substrings in binary representation of n.
 * @author Sean A. Irvine
 */
public class A078823 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z sum = Z.ZERO;
    final HashSet<Long> seen = new HashSet<>();
    do {
      long k = 0;
      while (k <= m) {
        k <<= 1;
        k += 1;
        if (seen.add(m & k)) {
          sum = sum.add(m & k);
        }
      }
      m >>>= 1;
    } while (m != 0);
    return sum;
  }
}

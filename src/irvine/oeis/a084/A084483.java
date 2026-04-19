package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084483 If the rightmost block of zeros in binary representation of n has an even length, then delete one 0, otherwise insert one 0 in this block.
 * @author Sean A. Irvine
 */
public class A084483 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    int k = 0;
    while ((m & 1) == 1) {
      m >>>= 1;
      ++k;
    }
    return Z.valueOf((((Long.numberOfTrailingZeros(m) & 1) == 0 ? m >>> 1 : m << 1) << k) + (1L << k) - 1);
  }
}

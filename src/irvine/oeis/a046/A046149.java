package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046149 Smallest n-digit number with maximal multiplicative persistence A014553.
 * @author Sean A. Irvine
 */
public class A046149 implements Sequence {

  private static final long[] SMALL = {0, 77, 679, 6788, 68889, 168889, 2677889, 26888999, 126888999,
    3778888999L, 13778888999L, 113778888999L, 1113778888999L, 11113778888999L};
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN <= SMALL.length) {
      return Z.valueOf(SMALL[mN - 1]);
    }
    if (mN < 233) {
      return Z.TEN.pow(mN - 15).subtract(1).multiply(1000000000000000L).divide(9).add(277777788888899L);
    }
    throw new UnsupportedOperationException();
  }
}

package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.Roman;

/**
 * A057226 Number of different symbols needed to express n as a Roman numeral.
 * @author Sean A. Irvine
 */
public class A057226 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final String roman = Roman.roman(++mN);
    long s = 0;
    for (int k = 0; k < roman.length(); ++k) {
      s |= 1L << roman.charAt(k);
    }
    return Z.valueOf(Long.bitCount(s));
  }
}

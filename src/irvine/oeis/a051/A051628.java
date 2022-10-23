package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051628 Number of digits in decimal expansion of 1/n before the periodic part begins.
 * @author Sean A. Irvine
 */
public class A051628 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    int i = 0;
    while ((m & 1) == 0) {
      m >>>= 1;
      ++i;
    }
    int j = 0;
    while (m % 5 == 0) {
      m /= 5;
      ++j;
    }
    return Z.valueOf(Math.max(i, j));
  }
}

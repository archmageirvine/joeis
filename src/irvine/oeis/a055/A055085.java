package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence2;

/**
 * A055085 Smallest integer containing all digits in all bases from 2 to n.
 * @author Sean A. Irvine
 */
public class A055085 extends Sequence2 {

  private int mN = 1;

  private boolean is(final Z t) {
    for (int base = 2; base <= mN; ++base) {
      for (final int c : ZUtils.digitCounts(t, base)) {
        if (c == 0) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    Z k = Z.valueOf(++mN).pow(mN - 1);
    while (!is(k)) {
      k = k.add(1);
    }
    return k;
  }
}

package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029581 All digits are composite.
 * @author Sean A. Irvine
 */
public class A029581 extends Sequence1 {

  private static final long[] DIGITS = {9, 4, 6, 8};
  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    Z t = Z.ONE;
    Z a = Z.ZERO;
    while (m > 0) {
      final int r = (int) (m & 3);
      m >>>= 2;
      if (r == 0) {
        --m;
      }
      a = t.multiply(DIGITS[r]).add(a);
      t = t.multiply(10);
    }
    return a;
  }
}

package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074153 Smallest n-digit power of n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074153 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z t = Z.valueOf(mN);
    final Z min = Z.TEN.pow(mN - 1);
    final Z max = min.multiply(10);
    while (t.compareTo(min) < 0) {
      t = t.multiply(mN);
    }
    return t.compareTo(max) >= 0 ? Z.ZERO : t;
  }
}

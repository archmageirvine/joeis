package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074154 Largest n-digit power of n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074154 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z t = Z.valueOf(mN);
    final Z min = Z.TEN.pow(mN - 1);
    final Z max = min.multiply(10);
    while (t.compareTo(min) < 0) {
      t = t.multiply(mN);
    }
    if (t.compareTo(max) >= 0) {
      return Z.ZERO;
    }
    while (true) {
      final Z u = t.multiply(mN);
      if (u.compareTo(max) >= 0) {
        return t;
      }
      t = u;
    }
  }
}

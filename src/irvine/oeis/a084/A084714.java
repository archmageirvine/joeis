package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084714 a(n) = smallest prime of the form (2n-1)^k - 2, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084714 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final Z m = Z.valueOf(2 * mN - 1);
    Z t = m;
    while (!t.subtract(2).isProbablePrime()) {
      t = t.multiply(m);
    }
    return t.subtract(2);
  }
}

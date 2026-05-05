package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084712 Smallest prime of the form (2n)^k + 1, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084712 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 4 || mN == 16) {
      return Z.ZERO;
    }
    final Z m = Z.valueOf(2 * mN);
    Z t = m;
    while (!t.add(1).isProbablePrime()) {
      t = t.multiply(m);
    }
    return t.add(1);
  }
}

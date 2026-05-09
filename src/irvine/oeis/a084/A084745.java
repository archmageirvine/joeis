package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084745 Smallest prime of the form n^k - k, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A084745 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      final Z u = t.subtract(++k);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}

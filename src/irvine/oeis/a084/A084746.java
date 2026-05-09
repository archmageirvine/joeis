package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084746 Smallest k such that n^k - k is a prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A084746 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      if (t.subtract(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}

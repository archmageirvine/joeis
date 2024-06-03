package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070219 Smallest prime obtained as a concatenation of n and a number m greater than n.
 * @author Sean A. Irvine
 */
public class A070219 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long lim = 1;
    Z t = Z.valueOf(mN);
    long k = (mN - 1) | 1;
    while (true) {
      k += 2;
      while (k > lim) {
        lim *= 10;
        t = t.multiply(10);
      }
      final Z u = t.add(k);
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}


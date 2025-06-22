package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078202 a(n) is the smallest prime of the form abs(n^k - k^n), the absolute difference between n^k and k^n, or -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A078202 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 16) {
      return Z.NEG_ONE;
    }
    long m = 0;
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(mN);
      final Z u = t.subtract(Z.valueOf(++m).pow(mN)).abs();
      if (u.isProbablePrime()) {
        return u;
      }
    }
  }
}


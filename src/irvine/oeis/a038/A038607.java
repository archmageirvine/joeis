package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A038607 a(n) is the smallest prime number k such that k &gt; n*pi(k), where pi(k) denotes the prime counting function.
 * @author Sean A. Irvine
 */
public class A038607 extends A000040 {

  private long mN = 0;
  private long mPi = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      ++mPi;
      final Z p = super.next();
      if (p.longValueExact() > mN * mPi) {
        return p;
      }
    }
  }
}

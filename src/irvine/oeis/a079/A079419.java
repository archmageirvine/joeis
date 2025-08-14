package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079419 Primes p such that p/i(p) &lt; prime(i(p)-1)/(i(p)-1), where i(p) = A049084(p).
 * @author Sean A. Irvine
 */
public class A079419 extends A000040 {

  private long mN = 1;
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z q = mP;
      mP = super.next();
      if (mP.multiply(mN - 1).compareTo(q.multiply(mN)) < 0) {
        return mP;
      }
    }
  }
}


package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072063 Smallest prime of form prime(n)+k*n, k&gt;0.
 * @author Sean A. Irvine
 */
public class A072063 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = super.next();
    while (true) {
      p = p.add(mN);
      if (p.isProbablePrime()) {
        return p;
      }
    }
  }
}

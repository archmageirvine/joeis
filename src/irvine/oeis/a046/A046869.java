package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046869 Good primes (version 1): prime(n)^2 &gt; prime(n-1)*prime(n+1).
 * @author Sean A. Irvine
 */
public class A046869 extends A000040 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z p = mA;
      mA = mB;
      mB = super.next();
      if (mA.square().compareTo(p.multiply(mB)) > 0) {
        return mA;
      }
    }
  }
}

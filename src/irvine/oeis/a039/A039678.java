package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A039678 Smallest number m &gt; 1 such that m^(p-1)-1 is divisible by p^2, where p = n-th prime.
 * @author Sean A. Irvine
 */
public class A039678 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z p2 = p.square();
    final Z pm1 = p.subtract(1);
    Z m = Z.ONE;
    while (true) {
      m = m.add(1);
      if (Z.ONE.equals(m.modPow(pm1, p2))) {
        return m;
      }
    }
  }
}

package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.a061.A061779;

/**
 * A074879 10 - Mod(prime(n),10) when prime(n) + 22 = prime(n+1).
 * @author Sean A. Irvine
 */
public class A074879 extends A061779 {

  @Override
  public Z next() {
    return Z.TEN.subtract(super.next().mod(10));
  }
}

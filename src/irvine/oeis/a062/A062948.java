package irvine.oeis.a062;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A062948 a(n) = H(A002808(n)) where H(n) is the half-totient function, H(n) = phi(n)/2: (A023022) and A002808(n) are the composites.
 * @author Sean A. Irvine
 */
public class A062948 extends A002808 {

  @Override
  public Z next() {
    return Euler.phi(super.next()).divide2();
  }
}


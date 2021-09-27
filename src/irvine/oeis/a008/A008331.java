package irvine.oeis.a008;

import irvine.math.z.Euler;
import irvine.math.z.Z;

/**
 * A008331 a(n) = phi(prime(n)+1).
 * @author Sean A. Irvine
 */
public class A008331 extends A008864 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}



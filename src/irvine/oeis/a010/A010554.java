package irvine.oeis.a010;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A010554 <code>a(n) = phi(phi(n))</code>, where phi is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A010554 extends A000010 {

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}


package irvine.oeis.a010;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A010554 a(n) = phi(phi(n)), where phi is the Euler totient function.
 * @author Sean A. Irvine
 */
public class A010554 extends A000010 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}


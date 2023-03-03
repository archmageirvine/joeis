package irvine.oeis.a077;
// manually knest/eulphi at 2023-03-01 16:41

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a007.A007088;

/**
 * A077811 Euler&apos;s totient of numbers containing in their decimal representation only the digits 0 and 1.
 * @author Georg Fischer
 */
public class A077811 extends A007088 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}

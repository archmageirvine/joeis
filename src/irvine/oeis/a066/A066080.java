package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A066080 Largest solution x to phi(x) + 1 = prime(n).
 * @author Sean A. Irvine
 */
public class A066080 extends A000040 {

  @Override
  public Z next() {
    return Euler.inversePhi(super.next().subtract(1)).last();
  }
}

package irvine.oeis.a058;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A058339 Number of solutions to 1 + phi(x) = prime(n), where phi is A000010.
 * @author Sean A. Irvine
 */
public class A058339 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Euler.inversePhi(super.next().subtract(1)).size());
  }
}


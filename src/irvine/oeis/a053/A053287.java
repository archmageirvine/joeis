package irvine.oeis.a053;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.a000.A000225;

/**
 * A053287 Euler totient function (A000010) of 2^n - 1.
 * @author Sean A. Irvine
 */
public class A053287 extends A000225 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Euler.phi(super.next());
  }
}


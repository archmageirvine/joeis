package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004676 Primes written in base 2.
 * @author Sean A. Irvine
 */
public class A004676 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(2));
  }
}


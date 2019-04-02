package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004680 Primes written in base 6.
 * @author Sean A. Irvine
 */
public class A004680 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(6));
  }
}


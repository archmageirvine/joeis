package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004684 Primes written in base 11. (Next term contains a nondecimal character.).
 * @author Sean A. Irvine
 */
public class A004684 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(11));
  }
}


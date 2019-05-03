package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004684 Primes written in base <code>11. (Next</code> term contains a nondecimal <code>character.)</code>.
 * @author Sean A. Irvine
 */
public class A004684 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(11));
  }
}


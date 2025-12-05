package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a122.A122821;

/**
 * A082370 a(n) = number of sets of consecutive primes whose arithmetic mean is A000040(n).
 * @author Sean A. Irvine
 */
public class A082370 extends A000040 {

  private final DirectSequence mA = new A122821();

  @Override
  public Z next() {
    return mA.a(super.next());
  }
}

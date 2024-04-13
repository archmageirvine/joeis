package irvine.oeis.a004;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A004087 Primes written backwards.
 * @author Sean A. Irvine
 */
public class A004087 extends A000040 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}


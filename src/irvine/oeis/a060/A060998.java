package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a008.A008578;

/**
 * A060998 Squares of 1 and primes, written backwards.
 * @author Sean A. Irvine
 */
public class A060998 extends A008578 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next().square());
  }
}

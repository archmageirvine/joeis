package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a138.A138613;

/**
 * A033766 Number of prime divisors (counted without multiplicity) of A138613(n).
 * @author Sean A. Irvine
 */
public class A033766 extends A138613 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.OMEGA.i(super.next()));
  }
}

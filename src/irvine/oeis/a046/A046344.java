package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a071.A071904;

/**
 * A046344 Sum of the prime factors of the odd composite numbers (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046344 extends A071904 {

  @Override
  public Z next() {
    return Functions.SOPFR.z(super.next());
  }
}

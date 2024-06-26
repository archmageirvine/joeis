package irvine.oeis.a366;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003261;

/**
 * A366899 Number of prime factors of n*2^n - 1, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A366899 extends A003261 {

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}

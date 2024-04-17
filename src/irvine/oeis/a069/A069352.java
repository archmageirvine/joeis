package irvine.oeis.a069;
// manually 2021-08-04

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A069352 Total number of prime factors of 3-smooth numbers.
 * @author Georg Fischer
 */
public class A069352 extends A003586 {

  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}

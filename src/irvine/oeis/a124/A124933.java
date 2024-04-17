package irvine.oeis.a124;
// manually knest/jaguarz at 2023-03-01 16:41

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a001.A001372;

/**
 * A124933 Number of prime divisors (counted with multiplicity) of number of endofunctions on n points (A001372).
 * @author Georg Fischer
 */
public class A124933 extends A001372 {
  @Override
  public Z next() {
    return Functions.BIG_OMEGA.z(super.next());
  }
}

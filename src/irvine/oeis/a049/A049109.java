package irvine.oeis.a049;
// Generated by gen_seq4.pl sigma0 at 2021-07-01 22:13

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005238;

/**
 * A049109 Number of divisors of A005238(n).
 * @author Georg Fischer
 */
public class A049109 extends A005238 {

  
  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

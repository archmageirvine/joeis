package irvine.oeis.a163;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A163379 a(n) = phi(phi(tau(n))).
 * @author Georg Fischer
 */
public class A163379 extends A163109 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

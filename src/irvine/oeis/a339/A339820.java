package irvine.oeis.a339;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a019.A019565;

/**
 * A339820 a(n) = phi(A019565(n)), where phi is Euler totient function.
 * @author Georg Fischer
 */
public class A339820 extends A019565 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

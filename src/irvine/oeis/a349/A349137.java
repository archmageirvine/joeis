package irvine.oeis.a349;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003602;

/**
 * A349137 a(n) = phi(A003602(n)), where A003602 is Kimberling's paraphrases, and phi is Euler totient function.
 * @author Georg Fischer
 */
public class A349137 extends A003602 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

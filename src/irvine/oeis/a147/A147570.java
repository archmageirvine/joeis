package irvine.oeis.a147;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a020.A020492;

/**
 * A147570 a(n) = phi(A020492(n)).
 * @author Georg Fischer
 */
public class A147570 extends A020492 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

package irvine.oeis.a172;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a083.A083553;

/**
 * A172042 a(n) = A000010(A083553(n)).
 * @author Georg Fischer
 */
public class A172042 extends A083553 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

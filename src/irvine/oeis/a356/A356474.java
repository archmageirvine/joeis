package irvine.oeis.a356;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a077.A077063;

/**
 * A356474 a(n) = phi(rad(prime(n)-1)), where phi = A000010 and rad = A007947.
 * @author Georg Fischer
 */
public class A356474 extends A077063 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

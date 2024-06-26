package irvine.oeis.a086;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002473;

/**
 * A086296 Euler's totient of 7-smooth numbers.
 * @author Georg Fischer
 */
public class A086296 extends A002473 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

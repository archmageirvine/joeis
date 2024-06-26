package irvine.oeis.a339;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a050.A050498;

/**
 * A339883 Values of Euler's totient phi for A050498.
 * @author Georg Fischer
 */
public class A339883 extends A050498 {

  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

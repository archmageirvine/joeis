package irvine.oeis.a089;
// Generated by gen_seq4.pl knest/eulphi at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a011.A011545;

/**
 * A089288 Euler's totient of floor(Pi*10^n), Pi=3.14....
 * @author Georg Fischer
 */
public class A089288 extends A011545 {
  @Override
  public Z next() {
    return Functions.PHI.z(super.next());
  }
}

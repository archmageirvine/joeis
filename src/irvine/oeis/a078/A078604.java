package irvine.oeis.a078;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a011.A011545;

/**
 * A078604 Largest prime factor of the integer formed by truncating the decimal expansion of Pi to n places.
 * @author Georg Fischer
 */
public class A078604 extends A011545 {
  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}

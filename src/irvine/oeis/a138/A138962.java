package irvine.oeis.a138;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A138962 a(1) = 1, a(n) = the smallest prime divisor of A138793(n).
 * @author Georg Fischer
 */
public class A138962 extends A138793 {
  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}

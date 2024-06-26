package irvine.oeis.a076;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000082;

/**
 * A076566 Greatest prime divisor of 3n+3 (sum of three successive integers).
 * @author Georg Fischer
 */
public class A076566 extends A000082 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}

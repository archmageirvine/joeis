package irvine.oeis.a087;
// Generated by gen_seq4.pl knest/jaguar at 2023-03-01 20:54

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a004.A004042;

/**
 * A087020 Greatest prime factor of n-th cyclic number.
 * @author Georg Fischer
 */
public class A087020 extends A004042 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Functions.GPF.z(super.next());
  }
}

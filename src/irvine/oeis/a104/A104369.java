package irvine.oeis.a104;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A104369 Number of divisors of A104365(n) = A104350(n) + 1.
 * @author Georg Fischer
 */
public class A104369 extends A104365 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

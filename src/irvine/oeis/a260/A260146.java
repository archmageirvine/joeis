package irvine.oeis.a260;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002109;

/**
 * A260146 Number of positive divisors of hyperfactorial(n).
 * @author Georg Fischer
 */
public class A260146 extends A002109 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

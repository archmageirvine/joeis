package irvine.oeis.a079;
// Generated by gen_seq4.pl sigman0/sigma0 at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a005.A005150;

/**
 * A079560 Number of divisors of n-th term of Look and Say Sequence A005150.
 * @author Georg Fischer
 */
public class A079560 extends A005150 {

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

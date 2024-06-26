package irvine.oeis.a063;
// Generated by gen_seq4.pl sigman0/sigma0s at 2023-02-28 16:47

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A063440 Number of divisors of n-th triangular number.
 * @author Georg Fischer
 */
public class A063440 extends A000217 {

  /** Construct the sequence. */
  public A063440() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return Functions.SIGMA0.z(super.next());
  }
}

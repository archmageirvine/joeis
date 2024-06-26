package irvine.oeis.a069;
// Generated by gen_seq4.pl expr_gen/lambda at 2023-08-28 19:36

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A069345 n minus the number of its prime-factors: a(n) = n - A001222(n).
 * a(n)=n-bigomega(n)
 * @author Georg Fischer
 */
public class A069345 extends LambdaSequence {

  /** Construct the sequence. */
  public A069345() {
    super(1, n -> Z.valueOf(n).subtract(Functions.BIG_OMEGA.z(n)));
  }
}

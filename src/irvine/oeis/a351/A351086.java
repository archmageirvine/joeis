package irvine.oeis.a351;
// Generated by gen_seq4.pl 2024-07-01/lambdan at 2024-07-01 18:26

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a327.A327858;
import irvine.oeis.a345.A345000;

/**
 * A351086 a(n) = gcd(A003415(n), A328572(n)), where A003415 is the arithmetic derivative and A328572 converts the primorial base expansion of n into its prime product form, but with 1 subtracted from all nonzero digits.
 * @author Georg Fischer
 */
public class A351086 extends LambdaSequence {

  private static final DirectSequence A327858 = new A327858();
  private static final DirectSequence A345000 = new A345000();

  /** Construct the sequence. */
  public A351086() {
    super(0, n -> Functions.GCD.z(A327858.a(n), A345000.a(n)));
  }
}

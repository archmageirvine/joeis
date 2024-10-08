package irvine.oeis.a328;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.function.Functions;
import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;

/**
 * A328405 The length of primorial base expansion (number of significant digits) of A276086(A276086(n)), where A276086(n) converts primorial base expansion of n into its prime product form.
 * @author Georg Fischer
 */
public class A328405 extends LambdaSequence {

  private static final DirectSequence A328403 = new A328403();

  /** Construct the sequence. */
  public A328405() {
    super(0, n -> Functions.PRIME_PI.z(Functions.GPF.z(A328403.a(n))));
  }
}

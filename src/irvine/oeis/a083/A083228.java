package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-06-17/lambdan at 2024-06-17 23:19

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A083228 A Jacobsthal related sequence.
 * @author Georg Fischer
 */
public class A083228 extends LambdaSequence {

  /** Construct the sequence. */
  public A083228() {
    super(0, n -> Functions.JACOBSTHAL.z(Binomial.binomial(n + 2, 2)));
  }
}

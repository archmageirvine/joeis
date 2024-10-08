package irvine.oeis.a192;
// Generated by gen_seq4.pl 2024-09-21.ack/lambdan at 2024-09-21 22:07

import irvine.math.cr.CR;
import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A192186 a(n) = binomial(2*n, floor(n*sqrt(2))).
 * @author Georg Fischer
 */
public class A192186 extends LambdaSequence {

  /** Construct the sequence. */
  public A192186() {
    super(0, n -> Binomial.binomial(2L * n, CR.SQRT2.multiply(n).floor().intValueExact()));
  }
}

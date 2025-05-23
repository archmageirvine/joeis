package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-22.ack/lambdan at 2025-05-22 22:55

import irvine.math.z.Binomial;
import irvine.oeis.LambdaSequence;

/**
 * A383797 a(n) = 10*binomial(n,5) + 4*binomial(n,3) + n.
 * @author Georg Fischer
 */
public class A383797 extends LambdaSequence {

  /** Construct the sequence. */
  public A383797() {
    super(0, n -> Binomial.binomial(n, 5).multiply(10).add(Binomial.binomial(n, 3).multiply(4)).add(n));
  }
}

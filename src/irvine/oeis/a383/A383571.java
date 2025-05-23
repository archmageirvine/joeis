package irvine.oeis.a383;
// Generated by gen_seq4.pl 2025-05-08.ack/lambdan at 2025-05-08 13:52

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.oeis.LambdaSequence;

/**
 * A383571 Expansion of 1/sqrt((1-x^3)^2 - 4*x^4).
 * @author Georg Fischer
 */
public class A383571 extends LambdaSequence {

  /** Construct the sequence. */
  public A383571() {
    super(0, n -> Integers.SINGLETON.sum(0, n / 3, k -> Binomial.binomial(n - 2 * k, k).multiply(Binomial.binomial(k, n - 3 * k))));
  }
}

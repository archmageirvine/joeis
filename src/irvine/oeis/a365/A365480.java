package irvine.oeis.a365;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.factor.factor.Jaguar;
import irvine.oeis.a356.A356191;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365480 The sum of unitary divisors of the smallest exponentially odd number that is divisible by n.
 * @author Georg Fischer
 */
public class A365480 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365480() {
    super(1, new A356191(), v -> Jaguar.factor(v).unitarySigma());
  }
}

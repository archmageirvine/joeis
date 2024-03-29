package irvine.oeis.a366;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.factor.factor.Jaguar;
import irvine.oeis.a138.A138302;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366538 The number of unitary divisors of the exponentially 2^n-numbers (A138302).
 * @author Georg Fischer
 */
public class A366538 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366538() {
    super(1, new A138302(), v -> Jaguar.factor(v).unitarySigma0());
  }
}

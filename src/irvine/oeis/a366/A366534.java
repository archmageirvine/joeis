package irvine.oeis.a366;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.factor.factor.Jaguar;
import irvine.oeis.a268.A268335;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366534 The number of unitary divisors of the exponentially odd numbers (A268335).
 * @author Georg Fischer
 */
public class A366534 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366534() {
    super(1, new A268335(), v -> Jaguar.factor(v).unitarySigma0());
  }
}

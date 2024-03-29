package irvine.oeis.a365;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.factor.factor.Jaguar;
import irvine.oeis.a008.A008833;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A365403 The sum of the unitary divisors of the largest square dividing n.
 * @author Georg Fischer
 */
public class A365403 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A365403() {
    super(1, new A008833(), v -> Jaguar.factor(v).unitarySigma());
  }
}

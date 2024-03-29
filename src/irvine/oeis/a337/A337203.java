package irvine.oeis.a337;
// Generated by gen_seq4.pl knowna4/simtraf at 2023-09-26 19:28

import irvine.factor.factor.Jaguar;
import irvine.oeis.a108.A108951;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A337203 Sum of the divisors of the primorial inflation of n.
 * @author Georg Fischer
 */
public class A337203 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A337203() {
    super(1, new A108951(), v -> Jaguar.factor(v).sigma());
  }
}

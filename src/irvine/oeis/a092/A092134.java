package irvine.oeis.a092;
// Generated by gen_seq4.pl cofr at 2021-07-23 19:30

import irvine.oeis.a144.A144749;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A092134 Continued fraction expansion for phi^phi, where phi is the golden ratio (1+sqrt(5))/2.
 * @author Georg Fischer
 */
public class A092134 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A092134() {
    super(0, new A144749());
  }
}

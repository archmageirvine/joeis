package irvine.oeis.a058;
// manually cofrseq/cofr at 2022-02-27

import irvine.oeis.a012.A012245;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A058304 Continued fraction for Liouville&apos;s number (A012245).
 * @author Georg Fischer
 */
public class A058304 extends ContinuedFractionSequence {

  /** Construct the sequence */
  public A058304() {
    super(new A012245());
  }
}

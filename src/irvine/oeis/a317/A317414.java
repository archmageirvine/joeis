package irvine.oeis.a317;

import irvine.oeis.a012.A012245;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A317413 Continued fraction for ternary expansion of Liouville's number interpreted in base 3 (A012245).
 * @author Georg Fischer
 */
public class A317414 extends ContinuedFractionSequence {

  /** Construct the sequence */
  public A317414() {
    super(new A012245(), 3);
  }
}

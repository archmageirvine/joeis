package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016479 Continued fraction for log(51).
 * @author Sean A. Irvine
 */
public class A016479 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016479() {
    super(new A016674());
  }
}

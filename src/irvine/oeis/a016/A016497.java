package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016497 Continued fraction for log(69).
 * @author Sean A. Irvine
 */
public class A016497 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016497() {
    super(new A016692());
  }
}

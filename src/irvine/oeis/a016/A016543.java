package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016543 Continued fraction for log(31/2).
 * @author Sean A. Irvine
 */
public class A016543 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016543() {
    super(new A016592());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016543 Continued fraction for <code>log(31/2)</code>.
 * @author Sean A. Irvine
 */
public class A016543 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016543() {
    super(new A016592());
  }
}

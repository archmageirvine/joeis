package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016572 Continued fraction for <code>log(89/2)</code>.
 * @author Sean A. Irvine
 */
public class A016572 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016572() {
    super(new A016621());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016453 Continued fraction for <code>log(25)</code>.
 * @author Sean A. Irvine
 */
public class A016453 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016453() {
    super(new A016648());
  }
}

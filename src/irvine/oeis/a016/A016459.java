package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016459 Continued fraction for <code>log(31)</code>.
 * @author Sean A. Irvine
 */
public class A016459 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016459() {
    super(new A016654());
  }
}

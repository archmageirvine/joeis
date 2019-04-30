package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016570 Continued fraction for <code>log(85/2)</code>.
 * @author Sean A. Irvine
 */
public class A016570 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016570() {
    super(new A016619());
  }
}

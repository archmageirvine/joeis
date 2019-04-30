package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016497 Continued fraction for <code>log(69)</code>.
 * @author Sean A. Irvine
 */
public class A016497 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016497() {
    super(new A016692());
  }
}

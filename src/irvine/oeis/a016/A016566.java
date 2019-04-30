package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016566 Continued fraction for <code>log(77/2)</code>.
 * @author Sean A. Irvine
 */
public class A016566 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016566() {
    super(new A016615());
  }
}

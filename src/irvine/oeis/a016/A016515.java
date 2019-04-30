package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016515 Continued fraction for <code>log(87)</code>.
 * @author Sean A. Irvine
 */
public class A016515 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016515() {
    super(new A016710());
  }
}

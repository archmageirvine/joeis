package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016739 Continued fraction for <code>log(11)</code>.
 * @author Sean A. Irvine
 */
public class A016739 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016739() {
    super(new A016634());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016481 Continued fraction for <code>log(53)</code>.
 * @author Sean A. Irvine
 */
public class A016481 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016481() {
    super(new A016676());
  }
}

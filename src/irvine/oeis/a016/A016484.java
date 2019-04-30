package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016484 Continued fraction for <code>log(56)</code>.
 * @author Sean A. Irvine
 */
public class A016484 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016484() {
    super(new A016679());
  }
}

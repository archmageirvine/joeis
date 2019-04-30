package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016468 Continued fraction for <code>log(40)</code>.
 * @author Sean A. Irvine
 */
public class A016468 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016468() {
    super(new A016663());
  }
}

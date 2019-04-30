package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016513 Continued fraction for <code>log(85)</code>.
 * @author Sean A. Irvine
 */
public class A016513 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016513() {
    super(new A016708());
  }
}

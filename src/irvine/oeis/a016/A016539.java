package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016539 Continued fraction for <code>log(23/2)</code>.
 * @author Sean A. Irvine
 */
public class A016539 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016539() {
    super(new A016588());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016534 Continued fraction for <code>log(13/2)</code>.
 * @author Sean A. Irvine
 */
public class A016534 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016534() {
    super(new A016583());
  }
}

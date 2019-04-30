package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016510 Continued fraction for <code>log(82)</code>.
 * @author Sean A. Irvine
 */
public class A016510 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016510() {
    super(new A016705());
  }
}

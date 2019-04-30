package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016530 Continued fraction for <code>log(5/2)</code>.
 * @author Sean A. Irvine
 */
public class A016530 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016530() {
    super(new A016579());
  }
}

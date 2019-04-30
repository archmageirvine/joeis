package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016544 Continued fraction for <code>log(33/2)</code>.
 * @author Sean A. Irvine
 */
public class A016544 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016544() {
    super(new A016593());
  }
}

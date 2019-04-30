package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016563 Continued fraction for <code>log(71/2)</code>.
 * @author Sean A. Irvine
 */
public class A016563 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016563() {
    super(new A016612());
  }
}

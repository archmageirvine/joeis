package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016568 Continued fraction for <code>log(81/2)</code>.
 * @author Sean A. Irvine
 */
public class A016568 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016568() {
    super(new A016617());
  }
}

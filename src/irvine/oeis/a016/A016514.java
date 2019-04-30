package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016514 Continued fraction for <code>log(86)</code>.
 * @author Sean A. Irvine
 */
public class A016514 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016514() {
    super(new A016709());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016491 Continued fraction for <code>log(63)</code>.
 * @author Sean A. Irvine
 */
public class A016491 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016491() {
    super(new A016686());
  }
}

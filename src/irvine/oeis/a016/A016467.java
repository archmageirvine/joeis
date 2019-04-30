package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016467 Continued fraction for <code>log(39)</code>.
 * @author Sean A. Irvine
 */
public class A016467 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016467() {
    super(new A016662());
  }
}

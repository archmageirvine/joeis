package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016483 Continued fraction for <code>log(55)</code>.
 * @author Sean A. Irvine
 */
public class A016483 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016483() {
    super(new A016678());
  }
}

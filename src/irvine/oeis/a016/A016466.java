package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016466 Continued fraction for <code>log(38)</code>.
 * @author Sean A. Irvine
 */
public class A016466 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016466() {
    super(new A016661());
  }
}

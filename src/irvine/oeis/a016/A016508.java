package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016508 Continued fraction for <code>log(80)</code>.
 * @author Sean A. Irvine
 */
public class A016508 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016508() {
    super(new A016703());
  }
}

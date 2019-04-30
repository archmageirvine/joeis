package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016561 Continued fraction for <code>log(67/2)</code>.
 * @author Sean A. Irvine
 */
public class A016561 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016561() {
    super(new A016610());
  }
}

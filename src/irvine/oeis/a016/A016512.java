package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016512 Continued fraction for <code>log(84)</code>.
 * @author Sean A. Irvine
 */
public class A016512 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016512() {
    super(new A016707());
  }
}

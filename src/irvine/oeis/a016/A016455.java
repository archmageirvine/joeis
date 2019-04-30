package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016455 Continued fraction for <code>log(27)</code>.
 * @author Sean A. Irvine
 */
public class A016455 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016455() {
    super(new A016650());
  }
}

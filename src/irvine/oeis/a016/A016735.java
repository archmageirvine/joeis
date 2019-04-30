package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016735 Continued fraction for <code>log(7)</code>.
 * @author Sean A. Irvine
 */
public class A016735 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016735() {
    super(new A016630());
  }
}

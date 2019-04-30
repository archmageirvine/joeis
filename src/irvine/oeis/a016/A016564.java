package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016564 Continued fraction for <code>log(73/2)</code>.
 * @author Sean A. Irvine
 */
public class A016564 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016564() {
    super(new A016613());
  }
}

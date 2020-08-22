package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016562 Continued fraction for log(69/2).
 * @author Sean A. Irvine
 */
public class A016562 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016562() {
    super(new A016611());
  }
}

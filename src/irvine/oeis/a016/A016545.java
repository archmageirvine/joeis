package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016545 Continued fraction for log(35/2).
 * @author Sean A. Irvine
 */
public class A016545 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016545() {
    super(new A016594());
  }
}

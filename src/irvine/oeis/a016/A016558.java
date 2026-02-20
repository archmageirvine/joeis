package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016558 Continued fraction for log(61/2).
 * @author Sean A. Irvine
 */
public class A016558 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016558() {
    super(1, new A016607());
  }
}

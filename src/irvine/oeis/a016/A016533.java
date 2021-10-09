package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016533 Continued fraction for log(11/2).
 * @author Sean A. Irvine
 */
public class A016533 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016533() {
    super(new A016582());
  }
}

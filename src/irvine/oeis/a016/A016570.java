package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016570 Continued fraction for log(85/2).
 * @author Sean A. Irvine
 */
public class A016570 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016570() {
    super(new A016619());
  }
}

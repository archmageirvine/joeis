package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016732 Continued fraction for log(4).
 * @author Sean A. Irvine
 */
public class A016732 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016732() {
    super(0, new A016627());
  }
}

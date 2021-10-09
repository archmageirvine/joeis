package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016549 Continued fraction for log(43/2).
 * @author Sean A. Irvine
 */
public class A016549 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016549() {
    super(new A016598());
  }
}

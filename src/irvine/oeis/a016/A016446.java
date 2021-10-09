package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016446 Continued fraction for log(18).
 * @author Sean A. Irvine
 */
public class A016446 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016446() {
    super(new A016641());
  }
}

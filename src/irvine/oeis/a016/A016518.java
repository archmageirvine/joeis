package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016518 Continued fraction for log(90).
 * @author Sean A. Irvine
 */
public class A016518 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016518() {
    super(new A016713());
  }
}

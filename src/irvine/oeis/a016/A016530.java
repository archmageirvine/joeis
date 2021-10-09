package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016530 Continued fraction for log(5/2).
 * @author Sean A. Irvine
 */
public class A016530 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016530() {
    super(new A016579());
  }
}

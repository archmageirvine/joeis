package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016441 Continued fraction for log(13).
 * @author Sean A. Irvine
 */
public class A016441 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016441() {
    super(new A016636());
  }
}

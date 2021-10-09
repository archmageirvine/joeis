package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016474 Continued fraction for log(46).
 * @author Sean A. Irvine
 */
public class A016474 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016474() {
    super(new A016669());
  }
}

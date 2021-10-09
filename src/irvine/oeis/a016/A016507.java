package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016507 Continued fraction for log(79).
 * @author Sean A. Irvine
 */
public class A016507 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016507() {
    super(new A016702());
  }
}

package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016734 Continued fraction for log(6).
 * @author Sean A. Irvine
 */
public class A016734 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016734() {
    super(new A016629());
  }
}

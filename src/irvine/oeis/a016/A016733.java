package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016733 Continued fraction for log(5).
 * @author Sean A. Irvine
 */
public class A016733 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016733() {
    super(0, new A016628());
  }
}

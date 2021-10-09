package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016523 Continued fraction for log(95).
 * @author Sean A. Irvine
 */
public class A016523 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016523() {
    super(new A016718());
  }
}

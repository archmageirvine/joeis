package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016548 Continued fraction for log(41/2).
 * @author Sean A. Irvine
 */
public class A016548 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016548() {
    super(new A016597());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016473 Continued fraction for log(45).
 * @author Sean A. Irvine
 */
public class A016473 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016473() {
    super(new A016668());
  }
}

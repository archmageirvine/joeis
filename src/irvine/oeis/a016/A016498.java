package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016498 Continued fraction for log(70).
 * @author Sean A. Irvine
 */
public class A016498 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016498() {
    super(new A016693());
  }
}

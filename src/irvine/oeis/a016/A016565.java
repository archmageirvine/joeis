package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016565 Continued fraction for log(75/2).
 * @author Sean A. Irvine
 */
public class A016565 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016565() {
    super(new A016614());
  }
}

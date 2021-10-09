package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016512 Continued fraction for log(84).
 * @author Sean A. Irvine
 */
public class A016512 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016512() {
    super(new A016707());
  }
}

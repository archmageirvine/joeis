package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016515 Continued fraction for log(87).
 * @author Sean A. Irvine
 */
public class A016515 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016515() {
    super(new A016710());
  }
}

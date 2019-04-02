package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016471 Continued fraction for log(43).
 * @author Sean A. Irvine
 */
public class A016471 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016471() {
    super(new A016666());
  }
}

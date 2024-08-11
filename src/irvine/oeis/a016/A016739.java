package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016739 Continued fraction for log(11).
 * @author Sean A. Irvine
 */
public class A016739 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016739() {
    super(0, new A016634());
  }
}

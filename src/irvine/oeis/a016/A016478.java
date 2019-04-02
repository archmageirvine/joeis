package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016478 Continued fraction for log(50).
 * @author Sean A. Irvine
 */
public class A016478 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016478() {
    super(new A016673());
  }
}

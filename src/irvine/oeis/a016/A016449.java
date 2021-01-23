package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016449 Continued fraction for log(21).
 * @author Sean A. Irvine
 */
public class A016449 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016449() {
    super(new A016644());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016442 Continued fraction for log(14).
 * @author Sean A. Irvine
 */
public class A016442 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016442() {
    super(new A016637());
  }
}

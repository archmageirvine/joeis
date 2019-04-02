package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016472 Continued fraction for log(44).
 * @author Sean A. Irvine
 */
public class A016472 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016472() {
    super(new A016667());
  }
}

package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016457 Continued fraction for log(29).
 * @author Sean A. Irvine
 */
public class A016457 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016457() {
    super(new A016652());
  }
}

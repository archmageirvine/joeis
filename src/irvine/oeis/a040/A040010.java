package irvine.oeis.a040;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A040010 Continued fraction for Pi*exp(-Pi^2/2).
 * @author Sean A. Irvine
 */
public class A040010 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A040010() {
    super(new A040009());
  }
}

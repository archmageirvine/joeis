package irvine.oeis.a013;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A013684 Continued fraction for zeta(8).
 * @author Sean A. Irvine
 */
public class A013684 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013684() {
    super(new A013666());
  }
}

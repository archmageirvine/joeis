package irvine.oeis.a013;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A013680 Continued fraction for zeta(4).
 * @author Sean A. Irvine
 */
public class A013680 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A013680() {
    super(0, new A013662());
  }
}

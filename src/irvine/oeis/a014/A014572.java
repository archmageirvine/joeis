package irvine.oeis.a014;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A014572 Continued fraction for Thue-Morse constant.
 * @author Sean A. Irvine
 */
public class A014572 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A014572() {
    super(0, new A014571());
  }
}

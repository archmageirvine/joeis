package irvine.oeis.a014;

import irvine.oeis.a006.A006752;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A014538 Continued fraction for Catalan's constant 1 - 1/9 + 1/25 - 1/49 + 1/81 - ...
 * @author Sean A. Irvine
 */
public class A014538 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A014538() {
    super(0, new A006752());
  }
}

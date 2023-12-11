package irvine.oeis.a006;

import irvine.oeis.a019.A019739;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A006083 Continued fraction for e/2.
 * @author Sean A. Irvine
 */
public class A006083 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A006083() {
    super(new A019739());
  }
}

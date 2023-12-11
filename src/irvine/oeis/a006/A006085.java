package irvine.oeis.a006;

import irvine.oeis.a019.A019741;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A006085 Continued fraction for e/4.
 * @author Sean A. Irvine
 */
public class A006085 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A006085() {
    super(new A019741());
  }
}

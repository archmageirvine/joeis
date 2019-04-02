package irvine.oeis.a003;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a005.A005532;

/**
 * A003117 Continued fraction for fifth root of 3.
 * @author Sean A. Irvine
 */
public class A003117 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A003117() {
    super(new A005532());
  }
}

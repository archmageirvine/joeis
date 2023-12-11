package irvine.oeis.a003;

import irvine.oeis.a001.A001113;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A003417 Continued fraction for e.
 * @author Sean A. Irvine
 */
public class A003417 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A003417() {
    super(new A001113());
  }
}

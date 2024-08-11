package irvine.oeis.a028;

import irvine.oeis.a160.A160388;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A028360 Continued fraction for (e + 1)/3.
 * @author Sean A. Irvine
 */
public class A028360 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028360() {
    super(0, new A160388());
  }
}


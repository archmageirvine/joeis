package irvine.oeis.a028;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a160.A160388;

/**
 * A028360 Continued fraction for (e + 1)/3.
 * @author Sean A. Irvine
 */
public class A028360 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028360() {
    super(new A160388());
  }
}


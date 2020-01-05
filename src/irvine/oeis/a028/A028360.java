package irvine.oeis.a028;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a160.A160388;

/**
 * A028360 Continued fraction for <code>(e + 1)/3</code>.
 * @author Sean A. Irvine
 */
public class A028360 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A028360() {
    super(new A160388());
  }
}


package irvine.oeis.a040;

import irvine.oeis.a037.A037996;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A040023 Continued fraction expansion of Pi*exp(2*Pi-Pi^2/2).
 * @author Sean A. Irvine
 */
public class A040023 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A040023() {
    super(2, new A037996());
  }
}

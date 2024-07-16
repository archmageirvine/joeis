package irvine.oeis.a060;

import irvine.oeis.a152.A152648;
import irvine.oeis.cons.ContinuedFractionDenominatorSequence;

/**
 * A060808 Denominators of ordinary continued fraction convergents for 2*zeta(3).
 * @author Sean A. Irvine
 */
public class A060808 extends ContinuedFractionDenominatorSequence {

  /** Construct the sequence. */
  public A060808() {
    super(new A152648());
  }
}

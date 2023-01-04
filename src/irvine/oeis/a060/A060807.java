package irvine.oeis.a060;

import irvine.oeis.a152.A152648;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A060807 Numerators of ordinary continued fraction for 2*zeta(3).
 * @author Sean A. Irvine
 */
public class A060807 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A060807() {
    super(new A152648());
  }
}

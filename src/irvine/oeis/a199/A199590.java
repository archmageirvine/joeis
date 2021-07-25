package irvine.oeis.a199;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A199590 Decimal expansion (unsigned) of the greatest root of 6x^3 + 18x^2 + 12x + 2 = 0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A199590 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A199590() {
    super(-1, CR.valueOf(new Q(4, 3)).sqrt().multiply(CR.TAU.divide(CR.NINE).sin()).subtract(CR.ONE));
  }
}

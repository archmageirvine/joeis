package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389019 Decimal expansion of 2 * Gamma(3/4)^4 / Pi.
 * @author Sean A. Irvine
 */
public class A389019 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389019() {
    super(1, CrFunctions.GAMMA.cr(new Q(3, 4)).pow(4).multiply(2).divide(CR.PI));
  }
}

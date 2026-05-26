package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395759 Decimal expansion of the sum of the reciprocals of 12-gonal polygorials A276482.
 * @author Sean A. Irvine
 */
public class A395759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395759() {
    super(1, CrFunctions.GAMMA.cr(new Q(1, 5)).multiply(CrFunctions.BESSEL_I.cr(new Q(-4, 5), CR.TWO.divide(CR.FIVE.sqrt()))).divide(CR.FIVE.pow(new Q(2, 5))));
  }
}

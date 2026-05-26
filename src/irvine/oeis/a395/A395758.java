package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395758 Decimal expansion of the sum of the reciprocals of the 11-gonal polygorials A084944.
 * @author Sean A. Irvine
 */
public class A395758 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395758() {
    super(1, CrFunctions.GAMMA.cr(new Q(2, 9)).multiply(CrFunctions.BESSEL_I.cr(new Q(-7, 9), CR.SQRT2.multiply(2).divide(3))).multiply(CR.valueOf(new Q(2, 9)).pow(new Q(7, 18))));
  }
}

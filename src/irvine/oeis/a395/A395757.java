package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395757 Decimal expansion of the sum of the reciprocals of the 10-gonal polygorials A084943.
 * @author Sean A. Irvine
 */
public class A395757 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395757() {
    super(1, CrFunctions.GAMMA.cr(Q.ONE_QUARTER).multiply(CrFunctions.BESSEL_I.cr(new Q(-3, 4), CR.ONE)).multiply(CR.TWO.pow(new Q(-3, 4))));
  }
}

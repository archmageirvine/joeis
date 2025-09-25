package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388671 Decimal expansion of sqrt(2/5) * (3+sqrt(5))^(1/4).
 * @author Sean A. Irvine
 */
public class A388671 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388671() {
    super(0, CR.TWO.pow(new Q(19, 20)).divide(50).multiply(CR.FIVE.pow(new Q(3, 4))).multiply(CrFunctions.GAMMA.cr(new Q(9, 10))).multiply(CrFunctions.GAMMA.cr(new Q(7, 10))).multiply(CR.FIVE.add(CR.FIVE.sqrt())).divide(CrFunctions.GAMMA.cr(new Q(4, 5)).square()));
  }
}

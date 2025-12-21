package irvine.oeis.a329;
// manually 2025-02-03/decexpr at 2025-02-08 09:10

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;
/**
 * A329089 Decimal expansion of Sum_{k&gt;=1} 1/(k^2-2), negated.
 * @author Georg Fischer
 */
public class A329089 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A329089() {
    super(-1, CR.NEG_ONE.add(CR.SQRT2.multiply(CR.PI).multiply(REALS.cot(CR.SQRT2.multiply(CR.PI)))).divide(CR.valueOf(-4)));
    next();
  }
}

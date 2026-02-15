package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392147 Decimal expansion of tan(1/3) + sec(1/3).
 * @author Sean A. Irvine
 */
public class A392147 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A392147() {
    super(1, REALS.tan(CR.ONE_THIRD).add(REALS.sec(CR.ONE_THIRD)));
  }
}

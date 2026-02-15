package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392146 Decimal expansion of tan(1/2) + sec(1/2).
 * @author Sean A. Irvine
 */
public class A392146 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A392146() {
    super(1, REALS.tan(CR.HALF).add(REALS.sec(CR.HALF)));
  }
}

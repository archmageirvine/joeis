package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392151 Decimal expansion of tan(2) - sec(2).
 * @author Sean A. Irvine
 */
public class A392151 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence */
  public A392151() {
    super(0, REALS.tan(CR.TWO).subtract(REALS.sec(CR.TWO)));
  }
}

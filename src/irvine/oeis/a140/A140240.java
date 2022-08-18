package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140240 Decimal expansion of arccos(7/8).
 * @author Sean A. Irvine
 */
public class A140240 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A140240() {
    super(0, REALS.acos(CR.SEVEN.divide(CR.EIGHT)));
  }
}

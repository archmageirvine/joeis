package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140243 Decimal expansion of 180*arccos(11/16)/Pi.
 * @author Sean A. Irvine
 */
public class A140243 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A140243() {
    super(REALS.acos(CR.valueOf(11).divide(CR.valueOf(16))).multiply(180).divide(CR.PI));
  }
}

package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140242 Decimal expansion of arccos(11/16).
 * @author Sean A. Irvine
 */
public class A140242 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A140242() {
    super(0, REALS.acos(CR.valueOf(11).divide(CR.valueOf(16))));
  }
}

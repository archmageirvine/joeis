package irvine.oeis.a140;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A140244 Decimal expansion of arccos(-1/4).
 * @author Sean A. Irvine
 */
public class A140244 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A140244() {
    super(REALS.acos(CR.valueOf(-4).inverse()));
  }
}

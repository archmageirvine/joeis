package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011114 Decimal expansion of 5th root of 29.
 * @author Sean A. Irvine
 */
public class A011114 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011114() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(29), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011336 Decimal expansion of 7th root of 14.
 * @author Sean A. Irvine
 */
public class A011336 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011336() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.SEVEN.inverse()));
  }
}

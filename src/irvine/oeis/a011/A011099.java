package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011099 Decimal expansion of 5th root of 14.
 * @author Sean A. Irvine
 */
public class A011099 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011099() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.FIVE.inverse()));
  }
}

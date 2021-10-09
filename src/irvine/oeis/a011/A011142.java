package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011142 Decimal expansion of 5th root of 57.
 * @author Sean A. Irvine
 */
public class A011142 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011142() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(57), CR.FIVE.inverse()));
  }
}

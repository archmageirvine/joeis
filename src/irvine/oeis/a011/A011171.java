package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011171 Decimal expansion of 5th root of 86.
 * @author Sean A. Irvine
 */
public class A011171 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011171() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(86), CR.FIVE.inverse()));
  }
}

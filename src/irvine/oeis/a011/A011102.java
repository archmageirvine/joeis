package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011102 Decimal expansion of 5th root of 17.
 * @author Sean A. Irvine
 */
public class A011102 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011102() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.FIVE.inverse()));
  }
}

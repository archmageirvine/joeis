package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011140 Decimal expansion of 5th root of 55.
 * @author Sean A. Irvine
 */
public class A011140 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011140() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(55), CR.FIVE.inverse()));
  }
}

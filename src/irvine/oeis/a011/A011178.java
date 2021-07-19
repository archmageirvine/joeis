package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011178 Decimal expansion of 5th root of 93.
 * @author Sean A. Irvine
 */
public class A011178 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011178() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(93), CR.FIVE.inverse()));
  }
}

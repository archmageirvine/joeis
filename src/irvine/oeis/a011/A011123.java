package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011123 Decimal expansion of 5th root of 38.
 * @author Sean A. Irvine
 */
public class A011123 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011123() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(38), CR.FIVE.inverse()));
  }
}

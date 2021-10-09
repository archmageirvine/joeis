package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011160 Decimal expansion of 5th root of 75.
 * @author Sean A. Irvine
 */
public class A011160 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011160() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(75), CR.FIVE.inverse()));
  }
}

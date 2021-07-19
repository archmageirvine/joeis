package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011128 Decimal expansion of 5th root of 43.
 * @author Sean A. Irvine
 */
public class A011128 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011128() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(43), CR.FIVE.inverse()));
  }
}

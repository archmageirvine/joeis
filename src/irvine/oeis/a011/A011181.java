package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011181 Decimal expansion of 5th root of 96.
 * @author Sean A. Irvine
 */
public class A011181 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011181() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(96), CR.FIVE.inverse()));
  }
}

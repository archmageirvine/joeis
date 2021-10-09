package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011155 Decimal expansion of 5th root of 70.
 * @author Sean A. Irvine
 */
public class A011155 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011155() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(70), CR.FIVE.inverse()));
  }
}

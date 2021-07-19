package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011091 Decimal expansion of 5th root of 6.
 * @author Sean A. Irvine
 */
public class A011091 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011091() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.FIVE.inverse()));
  }
}

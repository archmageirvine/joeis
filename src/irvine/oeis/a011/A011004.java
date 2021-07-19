package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011004 Decimal expansion of 4th root of 6.
 * @author Sean A. Irvine
 */
public class A011004 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011004() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.FOUR.inverse()));
  }
}

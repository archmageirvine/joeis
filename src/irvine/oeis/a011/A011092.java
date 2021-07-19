package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011092 Decimal expansion of 5th root of 7.
 * @author Sean A. Irvine
 */
public class A011092 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011092() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.FIVE.inverse()));
  }
}

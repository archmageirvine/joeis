package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011200 Decimal expansion of 6th root of 5.
 * @author Sean A. Irvine
 */
public class A011200 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011200() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.SIX.inverse()));
  }
}

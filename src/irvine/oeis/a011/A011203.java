package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011203 Decimal expansion of 9th root of 5.
 * @author Sean A. Irvine
 */
public class A011203 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011203() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.NINE.inverse()));
  }
}

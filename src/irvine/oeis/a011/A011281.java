package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011281 Decimal expansion of 12th root of 10.
 * @author Sean A. Irvine
 */
public class A011281 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011281() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.valueOf(12).inverse()));
  }
}

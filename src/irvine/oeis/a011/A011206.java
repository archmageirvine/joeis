package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011206 Decimal expansion of 12th root of 5.
 * @author Sean A. Irvine
 */
public class A011206 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011206() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(12).inverse()));
  }
}

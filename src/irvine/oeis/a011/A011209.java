package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011209 Decimal expansion of 15th root of 5.
 * @author Sean A. Irvine
 */
public class A011209 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011209() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(15).inverse()));
  }
}

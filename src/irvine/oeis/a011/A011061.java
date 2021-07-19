package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011061 Decimal expansion of 4th root of 69.
 * @author Sean A. Irvine
 */
public class A011061 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011061() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(69), CR.FOUR.inverse()));
  }
}

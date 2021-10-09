package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011143 Decimal expansion of 5th root of 58.
 * @author Sean A. Irvine
 */
public class A011143 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011143() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(58), CR.FIVE.inverse()));
  }
}

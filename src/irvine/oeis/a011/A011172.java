package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011172 Decimal expansion of 5th root of 87.
 * @author Sean A. Irvine
 */
public class A011172 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011172() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(87), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011169 Decimal expansion of 5th root of 84.
 * @author Sean A. Irvine
 */
public class A011169 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011169() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(84), CR.FIVE.inverse()));
  }
}

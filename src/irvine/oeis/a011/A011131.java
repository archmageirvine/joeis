package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011131 Decimal expansion of 5th root of 46.
 * @author Sean A. Irvine
 */
public class A011131 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011131() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(46), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011133 Decimal expansion of 5th root of 48.
 * @author Sean A. Irvine
 */
public class A011133 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011133() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(48), CR.FIVE.inverse()));
  }
}

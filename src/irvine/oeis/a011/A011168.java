package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011168 Decimal expansion of 5th root of 83.
 * @author Sean A. Irvine
 */
public class A011168 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011168() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(83), CR.FIVE.inverse()));
  }
}

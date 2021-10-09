package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011147 Decimal expansion of 5th root of 62.
 * @author Sean A. Irvine
 */
public class A011147 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011147() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(62), CR.FIVE.inverse()));
  }
}

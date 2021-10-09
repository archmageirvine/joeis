package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011176 Decimal expansion of 5th root of 91.
 * @author Sean A. Irvine
 */
public class A011176 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011176() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(91), CR.FIVE.inverse()));
  }
}

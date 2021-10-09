package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011154 Decimal expansion of 5th root of 69.
 * @author Sean A. Irvine
 */
public class A011154 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011154() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(69), CR.FIVE.inverse()));
  }
}

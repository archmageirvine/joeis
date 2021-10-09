package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011048 Decimal expansion of 4th root of 55.
 * @author Sean A. Irvine
 */
public class A011048 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011048() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(55), CR.FOUR.inverse()));
  }
}

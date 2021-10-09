package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011106 Decimal expansion of 5th root of 21.
 * @author Sean A. Irvine
 */
public class A011106 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011106() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(21), CR.FIVE.inverse()));
  }
}

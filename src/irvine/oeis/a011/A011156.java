package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011156 Decimal expansion of 5th root of 71.
 * @author Sean A. Irvine
 */
public class A011156 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011156() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(71), CR.FIVE.inverse()));
  }
}

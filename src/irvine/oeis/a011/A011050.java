package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011050 Decimal expansion of 4th root of 57.
 * @author Sean A. Irvine
 */
public class A011050 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011050() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(57), CR.FOUR.inverse()));
  }
}

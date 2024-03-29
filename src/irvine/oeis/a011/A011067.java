package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011067 Decimal expansion of 4th root of 75.
 * @author Sean A. Irvine
 */
public class A011067 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011067() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(75), CR.FOUR.inverse()));
  }
}

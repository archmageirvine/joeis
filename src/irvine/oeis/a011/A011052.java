package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011052 Decimal expansion of 4th root of 59.
 * @author Sean A. Irvine
 */
public class A011052 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011052() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(59), CR.FOUR.inverse()));
  }
}

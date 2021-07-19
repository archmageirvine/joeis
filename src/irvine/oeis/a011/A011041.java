package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011041 Decimal expansion of 4th root of 47.
 * @author Sean A. Irvine
 */
public class A011041 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011041() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(47), CR.FOUR.inverse()));
  }
}

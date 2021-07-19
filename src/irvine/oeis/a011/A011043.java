package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011043 Decimal expansion of 4th root of 50.
 * @author Sean A. Irvine
 */
public class A011043 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011043() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(50), CR.FOUR.inverse()));
  }
}

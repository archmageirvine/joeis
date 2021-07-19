package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011136 Decimal expansion of 5th root of 51.
 * @author Sean A. Irvine
 */
public class A011136 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011136() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(51), CR.FIVE.inverse()));
  }
}

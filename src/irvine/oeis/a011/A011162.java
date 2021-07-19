package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011162 Decimal expansion of 5th root of 77.
 * @author Sean A. Irvine
 */
public class A011162 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011162() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(77), CR.FIVE.inverse()));
  }
}

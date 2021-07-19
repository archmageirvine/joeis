package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011121 Decimal expansion of 5th root of 36.
 * @author Sean A. Irvine
 */
public class A011121 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011121() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(36), CR.FIVE.inverse()));
  }
}

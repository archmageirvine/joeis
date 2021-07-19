package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011129 Decimal expansion of 5th root of 44.
 * @author Sean A. Irvine
 */
public class A011129 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011129() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(44), CR.FIVE.inverse()));
  }
}

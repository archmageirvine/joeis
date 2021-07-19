package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011124 Decimal expansion of 5th root of 39.
 * @author Sean A. Irvine
 */
public class A011124 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011124() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(39), CR.FIVE.inverse()));
  }
}

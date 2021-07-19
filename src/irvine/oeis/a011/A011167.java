package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011167 Decimal expansion of 5th root of 82.
 * @author Sean A. Irvine
 */
public class A011167 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011167() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(82), CR.FIVE.inverse()));
  }
}

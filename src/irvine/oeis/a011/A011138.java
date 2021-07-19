package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011138 Decimal expansion of 5th root of 53.
 * @author Sean A. Irvine
 */
public class A011138 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011138() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(53), CR.FIVE.inverse()));
  }
}

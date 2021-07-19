package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011157 Decimal expansion of 5th root of 72.
 * @author Sean A. Irvine
 */
public class A011157 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011157() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(72), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011182 Decimal expansion of 5th root of 97.
 * @author Sean A. Irvine
 */
public class A011182 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011182() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(97), CR.FIVE.inverse()));
  }
}

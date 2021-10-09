package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011150 Decimal expansion of 5th root of 65.
 * @author Sean A. Irvine
 */
public class A011150 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011150() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(65), CR.FIVE.inverse()));
  }
}

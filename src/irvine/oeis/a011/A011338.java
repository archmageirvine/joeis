package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011338 Decimal expansion of 9th root of 14.
 * @author Sean A. Irvine
 */
public class A011338 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011338() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.NINE.inverse()));
  }
}

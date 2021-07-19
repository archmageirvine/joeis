package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011380 Decimal expansion of 6th root of 17.
 * @author Sean A. Irvine
 */
public class A011380 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011380() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.SIX.inverse()));
  }
}

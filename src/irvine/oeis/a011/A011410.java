package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011410 Decimal expansion of 6th root of 19.
 * @author Sean A. Irvine
 */
public class A011410 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011410() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.SIX.inverse()));
  }
}

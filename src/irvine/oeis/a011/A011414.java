package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011414 Decimal expansion of 10th root of 19.
 * @author Sean A. Irvine
 */
public class A011414 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011414() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.TEN.inverse()));
  }
}

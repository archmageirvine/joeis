package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011429 Decimal expansion of 10th root of 20.
 * @author Sean A. Irvine
 */
public class A011429 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011429() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.TEN.inverse()));
  }
}

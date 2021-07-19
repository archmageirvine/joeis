package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011354 Decimal expansion of 10th root of 15.
 * @author Sean A. Irvine
 */
public class A011354 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011354() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.TEN.inverse()));
  }
}

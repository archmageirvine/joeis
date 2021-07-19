package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011174 Decimal expansion of 5th root of 89.
 * @author Sean A. Irvine
 */
public class A011174 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011174() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(89), CR.FIVE.inverse()));
  }
}

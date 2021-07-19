package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011153 Decimal expansion of 5th root of 68.
 * @author Sean A. Irvine
 */
public class A011153 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011153() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(68), CR.FIVE.inverse()));
  }
}

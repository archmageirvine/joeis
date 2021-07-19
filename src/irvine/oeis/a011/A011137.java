package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011137 Decimal expansion of 5th root of 52.
 * @author Sean A. Irvine
 */
public class A011137 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011137() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(52), CR.FIVE.inverse()));
  }
}

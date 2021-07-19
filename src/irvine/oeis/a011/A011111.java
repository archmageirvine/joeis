package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011111 Decimal expansion of 5th root of 26.
 * @author Sean A. Irvine
 */
public class A011111 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011111() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(26), CR.FIVE.inverse()));
  }
}

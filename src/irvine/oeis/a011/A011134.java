package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011134 Decimal expansion of 5th root of 49.
 * @author Sean A. Irvine
 */
public class A011134 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011134() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(49), CR.FIVE.inverse()));
  }
}

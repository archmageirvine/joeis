package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011112 Decimal expansion of 5th root of 27.
 * @author Sean A. Irvine
 */
public class A011112 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011112() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(27), CR.FIVE.inverse()));
  }
}

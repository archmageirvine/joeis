package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011100 Decimal expansion of 5th root of 15.
 * @author Sean A. Irvine
 */
public class A011100 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011100() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.FIVE.inverse()));
  }
}

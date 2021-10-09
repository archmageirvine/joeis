package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011113 Decimal expansion of 5th root of 28.
 * @author Sean A. Irvine
 */
public class A011113 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011113() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(28), CR.FIVE.inverse()));
  }
}

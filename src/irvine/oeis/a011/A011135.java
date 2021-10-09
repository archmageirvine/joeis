package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011135 Decimal expansion of 5th root of 50.
 * @author Sean A. Irvine
 */
public class A011135 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011135() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(50), CR.FIVE.inverse()));
  }
}

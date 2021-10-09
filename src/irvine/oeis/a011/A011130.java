package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011130 Decimal expansion of 5th root of 45.
 * @author Sean A. Irvine
 */
public class A011130 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011130() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(45), CR.FIVE.inverse()));
  }
}

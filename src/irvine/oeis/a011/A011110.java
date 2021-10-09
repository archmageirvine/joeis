package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011110 Decimal expansion of 5th root of 25.
 * @author Sean A. Irvine
 */
public class A011110 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011110() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(25), CR.FIVE.inverse()));
  }
}

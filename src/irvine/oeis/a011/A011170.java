package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011170 Decimal expansion of 5th root of 85.
 * @author Sean A. Irvine
 */
public class A011170 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011170() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(85), CR.FIVE.inverse()));
  }
}

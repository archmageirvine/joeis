package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011081 Decimal expansion of 4th root of 90.
 * @author Sean A. Irvine
 */
public class A011081 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011081() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(90), CR.FOUR.inverse()));
  }
}

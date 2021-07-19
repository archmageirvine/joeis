package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011368 Decimal expansion of 9th root of 16.
 * @author Sean A. Irvine
 */
public class A011368 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011368() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.NINE.inverse()));
  }
}

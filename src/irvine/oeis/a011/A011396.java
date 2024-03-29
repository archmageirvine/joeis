package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011396 Decimal expansion of 7th root of 18.
 * @author Sean A. Irvine
 */
public class A011396 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011396() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.SEVEN.inverse()));
  }
}

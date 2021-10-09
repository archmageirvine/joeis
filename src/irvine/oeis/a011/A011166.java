package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011166 Decimal expansion of 5th root of 81.
 * @author Sean A. Irvine
 */
public class A011166 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011166() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(81), CR.FIVE.inverse()));
  }
}

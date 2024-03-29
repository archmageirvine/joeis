package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011097 Decimal expansion of 5th root of 12.
 * @author Sean A. Irvine
 */
public class A011097 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011097() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011125 Decimal expansion of 5th root of 40.
 * @author Sean A. Irvine
 */
public class A011125 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011125() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(40), CR.FIVE.inverse()));
  }
}

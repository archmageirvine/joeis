package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011103 Decimal expansion of 5th root of 18.
 * @author Sean A. Irvine
 */
public class A011103 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011103() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.FIVE.inverse()));
  }
}

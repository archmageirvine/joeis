package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011094 Decimal expansion of 5th root of 9.
 * @author Sean A. Irvine
 */
public class A011094 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011094() {
    super(ComputableReals.SINGLETON.pow(CR.NINE, CR.FIVE.inverse()));
  }
}

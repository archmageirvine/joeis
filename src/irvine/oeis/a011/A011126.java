package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011126 Decimal expansion of 5th root of 41.
 * @author Sean A. Irvine
 */
public class A011126 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011126() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(41), CR.FIVE.inverse()));
  }
}

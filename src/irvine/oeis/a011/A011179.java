package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011179 Decimal expansion of 5th root of 94.
 * @author Sean A. Irvine
 */
public class A011179 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011179() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(94), CR.FIVE.inverse()));
  }
}

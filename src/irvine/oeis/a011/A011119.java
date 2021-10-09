package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011119 Decimal expansion of 5th root of 34.
 * @author Sean A. Irvine
 */
public class A011119 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011119() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(34), CR.FIVE.inverse()));
  }
}

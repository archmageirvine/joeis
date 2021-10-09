package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011165 Decimal expansion of 5th root of 80.
 * @author Sean A. Irvine
 */
public class A011165 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011165() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(80), CR.FIVE.inverse()));
  }
}

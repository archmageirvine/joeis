package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011109 Decimal expansion of 5th root of 24.
 * @author Sean A. Irvine
 */
public class A011109 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011109() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(24), CR.FIVE.inverse()));
  }
}

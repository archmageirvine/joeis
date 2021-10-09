package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011063 Decimal expansion of 4th root of 71.
 * @author Sean A. Irvine
 */
public class A011063 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011063() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(71), CR.FOUR.inverse()));
  }
}

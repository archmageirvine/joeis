package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011149 Decimal expansion of 5th root of 64.
 * @author Sean A. Irvine
 */
public class A011149 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011149() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(64), CR.FIVE.inverse()));
  }
}

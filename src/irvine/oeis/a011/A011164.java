package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011164 Decimal expansion of 5th root of 79.
 * @author Sean A. Irvine
 */
public class A011164 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011164() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(79), CR.FIVE.inverse()));
  }
}

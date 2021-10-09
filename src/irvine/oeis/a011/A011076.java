package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011076 Decimal expansion of 4th root of 85.
 * @author Sean A. Irvine
 */
public class A011076 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011076() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(85), CR.FOUR.inverse()));
  }
}

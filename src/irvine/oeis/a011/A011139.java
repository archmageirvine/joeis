package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011139 Decimal expansion of 5th root of 54.
 * @author Sean A. Irvine
 */
public class A011139 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011139() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(54), CR.FIVE.inverse()));
  }
}

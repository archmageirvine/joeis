package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011218 Decimal expansion of 9th root of 6.
 * @author Sean A. Irvine
 */
public class A011218 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011218() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.NINE.inverse()));
  }
}

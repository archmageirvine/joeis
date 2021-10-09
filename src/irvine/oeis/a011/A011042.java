package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011042 Decimal expansion of 4th root of 48.
 * @author Sean A. Irvine
 */
public class A011042 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011042() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(48), CR.FOUR.inverse()));
  }
}

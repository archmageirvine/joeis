package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011060 Decimal expansion of 4th root of 68.
 * @author Sean A. Irvine
 */
public class A011060 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011060() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(68), CR.FOUR.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011219 Decimal expansion of 10th root of 6.
 * @author Sean A. Irvine
 */
public class A011219 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011219() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.TEN.inverse()));
  }
}

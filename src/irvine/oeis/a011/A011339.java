package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011339 Decimal expansion of 10th root of 14.
 * @author Sean A. Irvine
 */
public class A011339 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011339() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.TEN.inverse()));
  }
}

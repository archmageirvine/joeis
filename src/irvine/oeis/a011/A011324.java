package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011324 Decimal expansion of 10th root of 13.
 * @author Sean A. Irvine
 */
public class A011324 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011324() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.TEN.inverse()));
  }
}

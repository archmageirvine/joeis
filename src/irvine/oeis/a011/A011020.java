package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011020 Decimal expansion of 4th root of 24.
 * @author Sean A. Irvine
 */
public class A011020 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011020() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(24), CR.FOUR.inverse()));
  }
}

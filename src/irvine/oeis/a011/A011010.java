package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011010 Decimal expansion of 4th root of 13.
 * @author Sean A. Irvine
 */
public class A011010 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011010() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.FOUR.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011024 Decimal expansion of 4th root of 29.
 * @author Sean A. Irvine
 */
public class A011024 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011024() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(29), CR.FOUR.inverse()));
  }
}

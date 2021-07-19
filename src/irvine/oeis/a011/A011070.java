package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011070 Decimal expansion of 4th root of 78.
 * @author Sean A. Irvine
 */
public class A011070 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011070() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(78), CR.FOUR.inverse()));
  }
}

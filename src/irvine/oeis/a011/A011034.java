package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011034 Decimal expansion of 4th root of 40.
 * @author Sean A. Irvine
 */
public class A011034 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011034() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(40), CR.FOUR.inverse()));
  }
}

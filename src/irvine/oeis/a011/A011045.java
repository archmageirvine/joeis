package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011045 Decimal expansion of 4th root of 52.
 * @author Sean A. Irvine
 */
public class A011045 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011045() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(52), CR.FOUR.inverse()));
  }
}

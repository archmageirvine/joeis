package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011033 Decimal expansion of 4th root of 39.
 * @author Sean A. Irvine
 */
public class A011033 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011033() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(39), CR.FOUR.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011080 Decimal expansion of 4th root of 89.
 * @author Sean A. Irvine
 */
public class A011080 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011080() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(89), CR.FOUR.inverse()));
  }
}

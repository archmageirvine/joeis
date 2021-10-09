package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011055 Decimal expansion of 4th root of 62.
 * @author Sean A. Irvine
 */
public class A011055 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011055() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(62), CR.FOUR.inverse()));
  }
}

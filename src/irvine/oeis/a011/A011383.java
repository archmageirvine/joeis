package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011383 Decimal expansion of 9th root of 17.
 * @author Sean A. Irvine
 */
public class A011383 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011383() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.NINE.inverse()));
  }
}

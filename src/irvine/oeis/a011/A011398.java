package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011398 Decimal expansion of 9th root of 18.
 * @author Sean A. Irvine
 */
public class A011398 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011398() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.NINE.inverse()));
  }
}

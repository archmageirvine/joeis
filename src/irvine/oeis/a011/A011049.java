package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011049 Decimal expansion of 4th root of 56.
 * @author Sean A. Irvine
 */
public class A011049 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011049() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(56), CR.FOUR.inverse()));
  }
}

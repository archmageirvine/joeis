package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011038 Decimal expansion of 4th root of 44.
 * @author Sean A. Irvine
 */
public class A011038 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011038() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(44), CR.FOUR.inverse()));
  }
}

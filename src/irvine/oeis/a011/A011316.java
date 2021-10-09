package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011316 Decimal expansion of 17th root of 12.
 * @author Sean A. Irvine
 */
public class A011316 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011316() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(17).inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011311 Decimal expansion of 12th root of 12.
 * @author Sean A. Irvine
 */
public class A011311 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011311() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(12).inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011314 Decimal expansion of 15th root of 12.
 * @author Sean A. Irvine
 */
public class A011314 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011314() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(15).inverse()));
  }
}

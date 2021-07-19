package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011437 Decimal expansion of 18th root of 20.
 * @author Sean A. Irvine
 */
public class A011437 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011437() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(18).inverse()));
  }
}

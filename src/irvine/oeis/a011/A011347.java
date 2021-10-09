package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011347 Decimal expansion of 18th root of 14.
 * @author Sean A. Irvine
 */
public class A011347 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011347() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(18).inverse()));
  }
}

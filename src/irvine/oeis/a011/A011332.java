package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011332 Decimal expansion of 18th root of 13.
 * @author Sean A. Irvine
 */
public class A011332 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011332() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(18).inverse()));
  }
}

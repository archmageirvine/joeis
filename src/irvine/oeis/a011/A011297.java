package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011297 Decimal expansion of 13th root of 11.
 * @author Sean A. Irvine
 */
public class A011297 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011297() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(13).inverse()));
  }
}

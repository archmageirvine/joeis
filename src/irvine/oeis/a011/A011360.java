package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011360 Decimal expansion of 16th root of 15.
 * @author Sean A. Irvine
 */
public class A011360 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011360() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(16).inverse()));
  }
}

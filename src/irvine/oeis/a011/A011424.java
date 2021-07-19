package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011424 Decimal expansion of 20th root of 19.
 * @author Sean A. Irvine
 */
public class A011424 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011424() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(20).inverse()));
  }
}

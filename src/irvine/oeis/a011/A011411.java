package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011411 Decimal expansion of 7th root of 19.
 * @author Sean A. Irvine
 */
public class A011411 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011411() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.SEVEN.inverse()));
  }
}

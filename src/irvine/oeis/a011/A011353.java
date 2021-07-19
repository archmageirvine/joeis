package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011353 Decimal expansion of 9th root of 15.
 * @author Sean A. Irvine
 */
public class A011353 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011353() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.NINE.inverse()));
  }
}

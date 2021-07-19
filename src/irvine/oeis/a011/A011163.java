package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011163 Decimal expansion of 5th root of 78.
 * @author Sean A. Irvine
 */
public class A011163 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011163() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(78), CR.FIVE.inverse()));
  }
}

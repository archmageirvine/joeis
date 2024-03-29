package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011118 Decimal expansion of 5th root of 33.
 * @author Sean A. Irvine
 */
public class A011118 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011118() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(33), CR.FIVE.inverse()));
  }
}

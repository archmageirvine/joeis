package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011098 Decimal expansion of 5th root of 13.
 * @author Sean A. Irvine
 */
public class A011098 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011098() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.FIVE.inverse()));
  }
}

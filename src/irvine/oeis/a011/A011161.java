package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011161 Decimal expansion of 5th root of 76.
 * @author Sean A. Irvine
 */
public class A011161 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011161() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(76), CR.FIVE.inverse()));
  }
}

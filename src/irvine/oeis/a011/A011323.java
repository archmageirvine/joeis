package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011323 Decimal expansion of 9th root of 13.
 * @author Sean A. Irvine
 */
public class A011323 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011323() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.NINE.inverse()));
  }
}

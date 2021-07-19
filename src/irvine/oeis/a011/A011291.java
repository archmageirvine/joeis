package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011291 Decimal expansion of 7th root of 11.
 * @author Sean A. Irvine
 */
public class A011291 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011291() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.SEVEN.inverse()));
  }
}

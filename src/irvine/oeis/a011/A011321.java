package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011321 Decimal expansion of 7th root of 13.
 * @author Sean A. Irvine
 */
public class A011321 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011321() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.SEVEN.inverse()));
  }
}

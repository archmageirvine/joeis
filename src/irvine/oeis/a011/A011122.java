package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011122 Decimal expansion of 5th root of 37.
 * @author Sean A. Irvine
 */
public class A011122 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011122() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(37), CR.FIVE.inverse()));
  }
}

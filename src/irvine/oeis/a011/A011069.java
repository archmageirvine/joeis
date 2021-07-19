package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011069 Decimal expansion of 4th root of 77.
 * @author Sean A. Irvine
 */
public class A011069 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011069() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(77), CR.FOUR.inverse()));
  }
}

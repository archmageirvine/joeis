package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011175 Decimal expansion of 5th root of 90.
 * @author Sean A. Irvine
 */
public class A011175 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011175() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(90), CR.FIVE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011351 Decimal expansion of 7th root of 15.
 * @author Sean A. Irvine
 */
public class A011351 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011351() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.SEVEN.inverse()));
  }
}

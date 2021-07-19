package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011426 Decimal expansion of 7th root of 20.
 * @author Sean A. Irvine
 */
public class A011426 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011426() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.SEVEN.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011078 Decimal expansion of 4th root of 87.
 * @author Sean A. Irvine
 */
public class A011078 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011078() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(87), CR.FOUR.inverse()));
  }
}

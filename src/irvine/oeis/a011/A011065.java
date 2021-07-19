package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011065 Decimal expansion of 4th root of 73.
 * @author Sean A. Irvine
 */
public class A011065 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011065() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(73), CR.FOUR.inverse()));
  }
}

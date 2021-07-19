package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011026 Decimal expansion of 4th root of 31.
 * @author Sean A. Irvine
 */
public class A011026 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011026() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(31), CR.FOUR.inverse()));
  }
}

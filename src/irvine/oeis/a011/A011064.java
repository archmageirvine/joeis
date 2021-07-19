package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011064 Decimal expansion of 4th root of 72.
 * @author Sean A. Irvine
 */
public class A011064 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011064() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(72), CR.FOUR.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011077 Decimal expansion of 4th root of 86.
 * @author Sean A. Irvine
 */
public class A011077 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011077() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(86), CR.FOUR.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011057 Decimal expansion of 4th root of 65.
 * @author Sean A. Irvine
 */
public class A011057 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011057() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(65), CR.FOUR.inverse()));
  }
}

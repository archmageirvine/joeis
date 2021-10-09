package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011025 Decimal expansion of 4th root of 30.
 * @author Sean A. Irvine
 */
public class A011025 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011025() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(30), CR.FOUR.inverse()));
  }
}

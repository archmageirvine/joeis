package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011074 Decimal expansion of 4th root of 83.
 * @author Sean A. Irvine
 */
public class A011074 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011074() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(83), CR.FOUR.inverse()));
  }
}

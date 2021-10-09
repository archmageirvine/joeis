package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011085 Decimal expansion of 4th root of 94.
 * @author Sean A. Irvine
 */
public class A011085 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011085() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(94), CR.FOUR.inverse()));
  }
}

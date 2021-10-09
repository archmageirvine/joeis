package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011071 Decimal expansion of 4th root of 79.
 * @author Sean A. Irvine
 */
public class A011071 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011071() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(79), CR.FOUR.inverse()));
  }
}

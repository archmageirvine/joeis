package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011051 Decimal expansion of 4th root of 58.
 * @author Sean A. Irvine
 */
public class A011051 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011051() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(58), CR.FOUR.inverse()));
  }
}

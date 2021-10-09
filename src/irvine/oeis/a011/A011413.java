package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011413 Decimal expansion of 9th root of 19.
 * @author Sean A. Irvine
 */
public class A011413 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011413() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.NINE.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011305 Decimal expansion of 6th root of 12.
 * @author Sean A. Irvine
 */
public class A011305 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011305() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.SIX.inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011275 Decimal expansion of 6th root of 10.
 * @author Sean A. Irvine
 */
public class A011275 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011275() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.SIX.inverse()));
  }
}

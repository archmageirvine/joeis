package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011395 Decimal expansion of 6th root of 18.
 * @author Sean A. Irvine
 */
public class A011395 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011395() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.SIX.inverse()));
  }
}

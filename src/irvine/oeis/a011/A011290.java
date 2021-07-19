package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011290 Decimal expansion of 6th root of 11.
 * @author Sean A. Irvine
 */
public class A011290 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011290() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.SIX.inverse()));
  }
}

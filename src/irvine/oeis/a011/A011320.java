package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011320 Decimal expansion of 6th root of 13.
 * @author Sean A. Irvine
 */
public class A011320 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011320() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.SIX.inverse()));
  }
}

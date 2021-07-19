package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011358 Decimal expansion of 14th root of 15.
 * @author Sean A. Irvine
 */
public class A011358 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011358() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(14).inverse()));
  }
}

package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011352 Decimal expansion of 8th root of 15.
 * @author Sean A. Irvine
 */
public class A011352 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011352() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.EIGHT.inverse()));
  }
}
